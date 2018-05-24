package com.knoema.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 

{

	@FindBy(linkText="Apps")
	private WebElement Apps;
	
	@FindBy(linkText="Presets")
	private WebElement Preset;
	
	public AdminPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}
	
	public void clickApps()
	{
		Apps.click();
	}
	
	public void clickPreset()
	{
		Preset.click();
	}
}
