package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestUtility;

public class AddToCardPage extends TestUtility {
	
	
	
	@FindBy(xpath="(//span[contains(text(),'1 TB')])[2]")
	WebElement select_on_disk_capacity;
	
	@FindBy(name="submit.add-to-cart")
	WebElement click_on_Addto_card;
	
	public AddToCardPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void add_to_card(){
		//select_on_disk_capacity.click();
		click_on_Addto_card.click();
	}

}
