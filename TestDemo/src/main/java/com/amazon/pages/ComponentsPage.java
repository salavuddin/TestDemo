package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestUtility;

public class ComponentsPage extends TestUtility {

	
	@FindBy(xpath="//h2[contains(text(),'Samsung 860 EVO 500GB 2.5 Inch SATA III Internal SSD (MZ-76E500B/AM)')]")
	WebElement click_samsung_disk;
	
	public ComponentsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public AddToCardPage Click_on_samsung_disk(){
		
		click_samsung_disk.click();
		return new AddToCardPage();
	}
}
