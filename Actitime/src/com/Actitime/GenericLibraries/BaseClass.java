package com.Actitime.GenericLibraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver d;
	FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void dataBaseconnection() {
		Reporter.log("database connected successfuly",true);
	}
	@AfterSuite
	public void databaseDisconnection() {
		Reporter.log("database disconnected successfuly",true);
	}
	@BeforeClass
	public void LunchBrowser() throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		d=new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = f.readDataFromProperty("url");
		d.get(URL);
		Reporter.log("browser is launched",true);
	}
	@AfterClass
	public void closeBrowser() {
		d.close();
		Reporter.log("browser is closed");
	}
	@BeforeMethod
	public void login() throws IOException {
		String un = f.readDataFromProperty("username");
		String pw = f.readDataFromProperty("password");
		LoginPage lp=new LoginPage(d);
		lp.getUntbx().sendKeys(un);
		lp.getPwtbx().sendKeys(pw);
		lp.getLgnbt().click();
		
		
		Reporter.log("login successfuly",true);
	}
	@AfterMethod
	public void logout() {
		d.findElement(By.linkText("Logout")).click();
		Reporter.log("logout successfuly",true);
	}
}
