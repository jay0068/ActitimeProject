package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLibraries.BaseClass;
import com.Actitime.GenericLibraries.FileLibrary;
import com.Actitime.GenericLibraries.listnerDesignig;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;
@Listeners(listnerDesignig.class)
public class Task_Test extends BaseClass {
	@Test
	public void customer() throws EncryptedDocumentException, IOException {
		HomePage hp= new HomePage(d);
		hp.tasklink.click();
		TaskPage tp=new TaskPage(d);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		FileLibrary f=new FileLibrary();
		String name = f.readDataFromExcelFile("Sheet1", 4, 1);
		tp.getCustname().sendKeys(name);
		String description = f.readDataFromExcelFile("Sheet1", 4, 2);
		tp.getCustdest().sendKeys(description);
		//Assert.fail();
		tp.getCreatecust().click();
	}

}
