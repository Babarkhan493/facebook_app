package com.facebook.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.facebook.pageObjects.HomePage;
import com.facebook.testBase.BaseClass;

public class TC_HomePage_004 extends BaseClass{
	
	
	@Test(groups={"regression","master"})
	public void HomePage() throws InterruptedException, IOException 
	
	{
		logger.info("***** TC_HomePage_004 *****");
		
		
		driver.get(configPropObj.getProperty("welcomeURL"));
		
		HomePage login=new HomePage(driver);
		login.setEmail("khanasif.qa@gmail.com");
		login.setPassword("Rabika2020@");
		Thread.sleep(3000);
		login.clicklogin();
		Thread.sleep(3000);
		
		//login.setHomepage();
		driver.get(configPropObj.getProperty("welcomeURL"));
		Thread.sleep(3000);
		login.setCreatestory();
		
		Thread.sleep(3000);
		login.setCreatetextstory();
		
		Thread.sleep(3000);
		login.setWritetext("hello Facebook friends");
		
		Thread.sleep(3000);
		login.setSharestory();
		
		Thread.sleep(3000);
		//login.clicklogout();
		clicklogout();
		
		
		
		/*String exp_title="Facebook";
		String act_title=driver.getTitle();
		System.out.println("Title of the page:"+act_title);
		
		if(exp_title.equals(act_title))
		{
			logger.info("*****   Facebook passed ***** ");
			Assert.assertTrue(true);
		}
			else
			{
				logger.error("*****  Facebook failed ***** ");
				captureScreen(driver,"HomePageTest");
				Assert.assertTrue(false);
		}
		logger.info("*****  Finished TC_HomePage_004 ***** ");*/
	
	
	
		
	}

	private void clicklogout() {
		// TODO Auto-generated method stub
		
	}

}
