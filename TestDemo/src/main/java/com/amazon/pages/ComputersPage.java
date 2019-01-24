package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestUtility;

public class ComputersPage extends TestUtility {
	
	@FindBy(xpath="//img[@alt='Computer Components']")
	WebElement clickoncomponets;
	
	public ComputersPage(){
		PageFactory.initElements(driver, this);
	}

	
	public ComponentsPage clickonharddisk(){
		clickoncomponets.click();
		return new ComponentsPage();
	}
}
