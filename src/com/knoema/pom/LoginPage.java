package com.knoema.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(id="login")
	private WebElement loginLink;

	@FindBy(id="EMail")
	private WebElement EmailTextField;

	@FindBy(id="Password")
	private WebElement PasswordTextField;

	@FindBy(xpath ="//input[@class='login']")
	private WebElement SignInBtn;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}

	public void ClickLoginLink()
	{
		loginLink.click();
	}
	
	public void setUserEmail(String un)
	{
		EmailTextField.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		PasswordTextField.sendKeys(pw);
	}

	public void ClickSignupBtn()
	{
		SignInBtn.click();
	}
}
