package com.knoema.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.knoema.generics.AutoUtil;
import com.knoema.generics.BaseTest;
import com.knoema.pom.HomePage;
import com.knoema.pom.LoginPage;

public class knoema_LoginLogout extends BaseTest
{
	@Test
	public void testknoemaLoginLogout()
	{
		HomePage homepage = new HomePage(driver);
		WebElement username=homepage.ClickUserName();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(username).click().perform();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		homepage.clickAdmin();
		homepage.clickLogoutLink();
			
		Reporter.log("testknoemaLoginLogout",true);		
	}	
}
