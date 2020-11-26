package com.facebook.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.pageObjects.SignUpPage;
import com.facebook.testBase.BaseClass;
import com.facebook.utilities.XLUtils;

public class TC_SignUpDDT_002 extends BaseClass

{

	@Test(dataProvider="SignUpData",groups={"master"})
	public void signUpTest(String firstname, String lastname, String email, String pwd, String month, String day, String year,String gender, String exp) throws InterruptedException
	{
		logger.info("***** Starting TC_SignUpDDT_002 ");
		
		driver.get(configPropObj.getProperty("baseURL"));
		
		SignUpPage lp=new SignUpPage(driver);
		
				
		lp.setFirstName(firstname);
		lp.setLastName(lastname);
		lp.setEmailName(email);
		lp.setEmailconfirmation(email);
		lp.setPasswordName(pwd);
		
		Thread.sleep(5000);
		
		lp.setMonthName(month);
		lp.setDayName(day);
		lp.setYearName(year);
		lp.clickradio();
		
		
		Thread.sleep(5000);
		lp.clickSignUp();
		
		String exp_title="Sign Up for Facebook | Facebook";
		String act_title=driver.getTitle();
		
		if (exp_title.equals(act_title))
		{
			if(exp.equals("Pass"))
			{
				logger.info("***** SignUp Test passed *****");
				lp.clickSignUp();
				Thread.sleep(5000);
				Assert.assertTrue(true);
			}
			else if(exp.equals("Fail"))
			{
				logger.info("***** SignUp Test faild *****");
				lp.clickSignUp();
				Thread.sleep(5000);
				Assert.assertTrue(false);
			}
			else if(!exp_title.equals(act_title))
					{
				
				if(exp.equals("Pass"))
				{
					logger.warn("**** signup failed *****");
					Assert.assertTrue(false);
				}
				else if(exp.equals("fail"))
				{
					logger.info("***** SignUp Test passed *****");
					Assert.assertTrue(true);
				}
			}
		}	
		logger.info("**** Finished TC_SignUpDDT_002 ******");
		
	}
	
	@DataProvider(name="SignUpData")
	public String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\testData\\Book1.xlsx";
		//String path=System.getProperty("user.dir")+"/testData/SignUpData.xlsx";
	
		int totalrows=XLUtils.getRowCount(path, "Sheet1");           //4
		int totalcols=XLUtils.getCellCount(path, "Sheet1", 1);       //7
		
		String signupdata[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
		
			for(int j=0;j<totalcols;j++)
			{
				signupdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return signupdata;
	}	
}
