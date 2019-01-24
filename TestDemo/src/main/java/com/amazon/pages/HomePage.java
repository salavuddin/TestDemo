package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestUtility;

public class HomePage extends TestUtility {
	
	@FindBy(xpath="//span[contains(text(),'Deliver to salavuddin')]")
	WebElement homepage_label;
	
	@FindBy(xpath="//span[contains(text(),'Departments')]")
	WebElement department;
	
	@FindBy(xpath="//span[contains(text(),'Computers')]")
	WebElement computers;
	

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public ComputersPage click_on_cumputers(){
		Actions a=new Actions(driver);
		
		a.moveToElement(department).perform();
		computers.click();
		
		return new ComputersPage();
	}
	
	
}
