package com.amazon.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.pages.ComponentsPage;
import com.amazon.pages.ComputersPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.SignInPage;
import com.amazon.utility.TestUtility;

public class ComponentsPageTest extends TestUtility {

	SignInPage Signin;
	LoginPage login;
	ComputersPage computersPage;
	HomePage homepage;
	ComponentsPage componentpage;
	public ComponentsPageTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setup(){
		intialization();
		Signin=new SignInPage();
		//Click on Signin Button
		login=Signin.signin();
		//Enter Username & Password
		homepage =	login.login(p.getProperty("username"), p.getProperty("password"));
		computersPage = homepage.click_on_cumputers();
		componentpage=computersPage.clickonharddisk();
	}
	
	@Test
	public void select_samsungdisk(){
		componentpage.Click_on_samsung_disk();
	}
	
}
