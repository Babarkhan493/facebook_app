package com.facebook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	@CacheLookup
	WebElement txtName;
	
	
	@FindBy(name="lastname")
	@CacheLookup
	WebElement txtID;
	
	
	@FindBy(name="reg_email__")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(name="reg_email_confirmation__")
	@CacheLookup
	WebElement txtemailconfirmation;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//select[@id='month']")
	@CacheLookup
	WebElement monthdd;
	
	@FindBy(xpath="//select[@id='day']")
	@CacheLookup
	WebElement daydd;
	
	@FindBy(name="birthday_year")
	@CacheLookup
	WebElement yeardd;
	
	@FindBy(xpath="//label[normalize-space()='Male']")
	@CacheLookup
	WebElement clickradio;
		
	@FindBy(name="websubmit")
	@CacheLookup
	WebElement btnSignUP;
	
	
	
	public void setFirstName(String firstname)
	{
		txtName.clear();
		txtName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname)
	{
		txtID.clear();
		txtID.sendKeys(lastname);
	}
	
	public void setEmailName(String email)
	{
		txtemail.clear();
		txtemail.sendKeys(email);
	}
	public void setEmailconfirmation(String confirmation)
	{
		txtemailconfirmation.clear();
		txtemailconfirmation.sendKeys(confirmation);
	}
	
	public void setPasswordName(String password)
	{
		txtpassword.clear();
		txtpassword.sendKeys(password);
	}
	
	public void setMonthName(String month)
	{
		monthdd.sendKeys(month);
	}
	
	public void setDayName(String day)
	{
		daydd.sendKeys(day);	
	}
	
	public void setYearName(String year)
	{
		yeardd.sendKeys(year);	
	}
	
	public void clickradio()
	{
		clickradio.click();
	}
    
		public void clickSignUp()
		{
			btnSignUP.click();
			
	
	}
}
