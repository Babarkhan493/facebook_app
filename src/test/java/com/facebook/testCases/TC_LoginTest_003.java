package com.facebook.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.facebook.pageObjects.LoginPage;
import com.facebook.testBase.BaseClass;

public class TC_LoginTest_003 extends BaseClass{

	@Test(groups={"sanity","regression","master"})
	public void LoginTest() throws InterruptedException, IOException 
	
	{
		logger.info("***** Starting TC_Login_003 *****");
		
		
		driver.get(configPropObj.getProperty("loginURL"));
		
		//SignUpPage lp=new SignUpPage(driver);
		//String baseUrl = "http://www.facebook.com";
		//WebDriver driver = new FirefoxDriver();
		
		/*logger.info("***** Providing SignUp details *****");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("khanasif.qa@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Rabika2020@");
		
		WebElement blogin=driver.findElement(By.id("u_0_h"));
		Thread.sleep(5000);
		blogin.submit();
		*/
	
		LoginPage login=new LoginPage(driver);
		login.setEmail("khanasif.qa@gmail.com");
		login.setPassword("Rabika2020@");
		Thread.sleep(3000);
		login.clicklogin();
		//Search by key word
		
		login.setSearch("farooq haider");
		
		
		
		
		// validation
		/*if (login.verifyConfirmationMsg()) {
			logger.info("***************  Facebook login succesfully Passed *********** ");
			Assert.assertTrue(true);

		} else {
			logger.error("*************** Facebook login failed *********** ");
			captureScreen(driver,"login");
			Assert.assertTrue(false);
		}
		logger.info("***************   TC_LoginTest_003 Finished  *********** ");*/
	
	
	
	}
	
	}

