package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//decleration
	@FindBy(xpath = "//div[.='Tasks']")
	public WebElement tasklink;
	
	@FindBy(xpath = "//div[.='Reports']")
	public WebElement Reportlink;
	
	@FindBy(xpath = "//div[.='Users']")
	public WebElement userlink;
	
	//initilization
	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
		
	}
	//utilization 

	public WebElement getTasklink() {
		return tasklink;
	}

	public WebElement getReportlink() {
		return Reportlink;
	}

	public WebElement getUserlink() {
		return userlink;
	}
	
	
	

}
