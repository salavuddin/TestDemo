package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestUtility;

public class SignInPage extends TestUtility{
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	WebElement hello_signin_link;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	WebElement signin_link;
	
public SignInPage(){
	PageFactory.initElements(driver, this);
}
	public LoginPage signin(){
		Actions a=new Actions(driver);
		a.moveToElement(hello_signin_link).perform();
		signin_link.click();
		return new LoginPage();
	}
	
	
}
