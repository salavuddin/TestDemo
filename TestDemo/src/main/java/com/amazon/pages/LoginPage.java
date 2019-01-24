package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestUtility;

public class LoginPage extends TestUtility{
	@FindBy(name="email")
	WebElement EmailId;
			
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement submit_btn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	
	public HomePage login(String un,String pw){
		
		EmailId.sendKeys(un);
		Password.sendKeys(pw);
		submit_btn.click();
		return new HomePage();
		
	}
}
