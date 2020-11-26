package com.facebook.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implit wait
		driver.manage().window().maximize();
	}
	
	@FindBy(xpath="//*[name()='path' and contains(@d,'M25.825 12')]")
	@CacheLookup
	WebElement clickhomepage;
	
	@FindBy(xpath="//div[@class='cwj9ozl2 j83agx80 pfnyh3mw taijpn5t dhxd5tqv hv4rvrfc f10w8fjw dati1w0a l9j0dhe7']")
	@CacheLookup
	WebElement clickcreatestory;
	
	@FindBy(xpath="//div[contains(text(),'Create a Text Story')]")
	@CacheLookup
	WebElement clickcreatetextstory;
	
	@FindBy(xpath="//textarea['jsc_c_19']")
	@CacheLookup
	WebElement writetext;
		
	@FindBy(xpath="//span[contains(text(),'Share to Story')]")
	@CacheLookup
	WebElement clicksharestory;
	
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	@CacheLookup
	WebElement clicklogout;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement txtemail1;
	
	@FindBy(xpath="//input[@id='pass']")
	@CacheLookup
	WebElement txtpass;
	
	@FindBy(xpath="//button[.='Log In']")
	@CacheLookup
	WebElement btnlogin;
	
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
	public void setHomepage()
	{
		
		clickhomepage.click();
	}
	
	public void setCreatestory()
	{
		clickcreatestory.click();
	}
	
	public void setCreatetextstory()
	{
		clickcreatetextstory.click();
	}
	
	public void setWritetext(String text)
	{
		writetext.clear();
		writetext.sendKeys(text);
	}
	
	public void setSharestory()
	{
		clicksharestory.click();
	}
	public void clicklogout()
	{
		clicklogout.click();
		}
	}

