package com.facebook.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
	}
	
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement txtemail1;
	
	@FindBy(xpath="//input[@id='pass']")
	@CacheLookup
	WebElement txtpass;
	
	@FindBy(xpath="//button[.='Log In']")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath="//input[@placeholder='Search Facebook']")
	@CacheLookup
	WebElement txtsearch;
	
	/*@FindBy(xpath="//span[contains(text(),'Add Picture')]")
	@CacheLookup
	WebElement photo;
	
	@FindBy(xpath="//span[contains(text(),'Upload Photo')]")
	@CacheLookup
	WebElement upload;*/
	
	public void setEmail(String email)
	{
		txtemail1.sendKeys(email);
	}
	
	public void setPassword(String pass)
	{
		txtpass.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		
		btnlogin.click();
	}
    public void setSearch(String search) throws InterruptedException
	{
		txtsearch.sendKeys(search);
		Thread.sleep(3000);
		txtsearch.sendKeys(Keys.ENTER);
	}
	
	
	/*public boolean verifyConfirmationMsg()
	{
		String msg=driver.findElement(By.id("login")).getText();
		if (msg.contains("The facebook login successfully"))
		{
			return true;
		}
		else
		{
			return false;
		}
	  }*/
	}
	
	

