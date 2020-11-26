package com.facebook.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook.pageObjects.GroupsPage;
import com.facebook.testBase.BaseClass;
import com.sun.mail.imap.Utility;

public class TC_Groups_005 extends BaseClass{

	@Test(groups={"master"})
	public void GroupsPage() throws InterruptedException, IOException 
	
	{
		logger.info("***** TC_Groups_005 *****");
		
		
		driver.get(configPropObj.getProperty("welcomeURL"));
		
		GroupsPage login=new GroupsPage(driver);
		
		login.setEmail("khanasif.qa@gmail.com");
		login.setPassword("Rabika2020@");
		Thread.sleep(3000);
		login.clicklogin();
		Thread.sleep(3000);
	
		driver.get(configPropObj.getProperty("welcomeURL"));
		
		login.clickgroups();
		Thread.sleep(3000);
		
		login.clickcreatenewgroup();
		
		Thread.sleep(3000);
		
		login.groupname("mzd");
		Thread.sleep(3000);
		
		login.clickprivatedropdown();
		Thread.sleep(3000);
		
		login.clickhiddendropdown();
		Thread.sleep(3000);
		
		login.invitefriend("Ali");
		Thread.sleep(3000);
		
	
	}
}
