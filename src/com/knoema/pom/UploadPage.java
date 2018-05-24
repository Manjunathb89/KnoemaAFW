package com.knoema.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage 
{
	@FindBy(xpath="//div[@class='option browse-local']")
	private WebElement  BrowselocalBnt;
	 

	public UploadPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	
	public void ClickonBrowselocalBnt()
	{
		BrowselocalBnt.click();
	}
}
