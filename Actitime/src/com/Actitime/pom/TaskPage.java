package com.Actitime.pom;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//decleration 
	@FindBy(xpath = "//div[.='Add New']")
	public WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	public WebElement newcust;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	public WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	public WebElement custdest;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	public WebElement createcust;
	
	//initilization
	public TaskPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdest() {
		return custdest;
	}

	public WebElement getCreatecust() {
		return createcust;
	}
   
}

