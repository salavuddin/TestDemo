package com.amazon.TestCases;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.pages.LoginPage;
import com.amazon.pages.SignInPage;
import com.amazon.utility.TestUtility;

public class LoginPageTest extends TestUtility {
	SignInPage Signin;
	LoginPage login;
	public LoginPageTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setup(){
		intialization();
		Signin=new SignInPage();
		//Click on Signin Button
		login=Signin.signin();
		
		
	}
@Test
public void Execute_TestCase(){
	//Enter Username & Password
	login.login(p.getProperty("username"), p.getProperty("password"));
	System.out.println("login complited");
}
}
