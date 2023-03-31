package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//decleration
		@FindBy(id = "username") //findby annotation is work as find element method
		private WebElement untbx;
		
		@FindBy(name = "pwd")
		private WebElement pwtbx;
		
		@FindBy(xpath =  "//div[.='Login ']")
		private WebElement lgnbt;
		
		//initilization  
		public LoginPage (WebDriver d) {
			PageFactory.initElements(d, this);
		}

		
		//utilization 
		
		public WebElement getUntbx() {
			return untbx;
		}

		public WebElement getPwtbx() {
			return pwtbx;
		}

		public WebElement getLgnbt() {
			return lgnbt;
		}

}
