package com.knoema.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatasetViewerPage 
{
	@FindBy(id="random-selection")
	private WebElement  Randomlink;
 

	public DatasetViewerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	
	public void OpenDataset()
	{
		
	}
	public void ClickOnRandomLink()
	{
		Randomlink.click();
	}
}
