package com.amazon.utility;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;



public class TestUtility {
	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream f;
	public TestUtility(){
		try {
			p=new Properties();
			f=new FileInputStream("./resources/config.properties");
			p.load(f);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void intialization(){
		String browsername = p.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browsername.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
     
	}
	
	
}
