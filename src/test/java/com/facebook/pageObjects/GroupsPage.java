package com.facebook.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupsPage {
	
	WebDriver driver;
	public GroupsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
		driver.manage().window().maximize();
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
		
		@FindBy(xpath="//a[@aria-label='Groups']//span[@class='l9j0dhe7']//*[local-name()='svg']")
		@CacheLookup
		WebElement clickgroups;
		
		@FindBy(xpath="//span[contains(text(),'Create New Group')]")
		@CacheLookup
		WebElement clickcreatenewgroup;
		
		@FindBy(xpath="//input[@id='jsc_c_23']")
		@CacheLookup
		WebElement groupname;
		
		@FindBy(xpath="//span[normalize-space()='Private']")
		@CacheLookup
		WebElement clickprivatedropdown;
		
		
		@FindBy(xpath="//span[contains(text(),'Hidden')]")
		@CacheLookup
		WebElement clickhiddendropdown;
		
		
		@FindBy(xpath="//input[@id='jsc_c_1c']")
		@CacheLookup
		WebElement invitefriend;
		
		
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
		
		public void clickgroups()
		{
			
			clickgroups.click();
		}
		public void clickcreatenewgroup()
		{
			clickcreatenewgroup.click();
		}
		
		
		public void groupname(String mzd)
		{
			groupname.sendKeys(mzd);
		}
		
		
		public void clickprivatedropdown()
		{
			clickprivatedropdown.click();
		}
		
		
		public void clickhiddendropdown()
		{
			clickhiddendropdown.click();
		}
		
		public void invitefriend(String Ali)
		{
			invitefriend.sendKeys(Ali);
		}
	}


