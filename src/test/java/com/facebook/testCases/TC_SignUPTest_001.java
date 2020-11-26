package com.facebook.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook.pageObjects.SignUpPage;
import com.facebook.testBase.BaseClass;


public class TC_SignUPTest_001 extends BaseClass{
	
	
	@Test(groups={"sanity","regression","master"})
	public void SignUPTest() throws InterruptedException, IOException 
	
	{
		logger.info("***** Starting TC_SignUPTest_001 *****");
		
		driver.get(configPropObj.getProperty("baseURL"));
		
		SignUpPage lp=new SignUpPage(driver);
		logger.info("***** Providing SignUp details *****");
		
		
		lp.setFirstName(configPropObj.getProperty("userfirstname"));
		lp.setLastName(configPropObj.getProperty("userlastname"));
		lp.setEmailName(configPropObj.getProperty("useremailname"));
		lp.setEmailconfirmation(configPropObj.getProperty("useremailconfirmation"));
		lp.setPasswordName(configPropObj.getProperty("password"));
		Thread.sleep(5000);
		
		lp.setMonthName(configPropObj.getProperty("monthname"));
		lp.setDayName(configPropObj.getProperty("dayname"));
		lp.setYearName(configPropObj.getProperty("yearname"));
		lp.clickradio();
		
		Thread.sleep(5000);
		lp.clickSignUp();
		
		String exp_title="Sign Up for Facebook | Facebook";
		String act_title=driver.getTitle();
		System.out.println("Title of the page:"+act_title);
		
		if(exp_title.equals(act_title))
		{
			logger.info("*****   SignUP passed ***** ");
			Assert.assertTrue(true);
		}
			else
			{
				logger.error("*****  SignUP failed ***** ");
				captureScreen(driver,"SignUPTest");
				Assert.assertTrue(false);
		}
		logger.info("*****  Finished TC_SignUPTest_001 ***** ");
	}
}
		
	
	
	
	
	
