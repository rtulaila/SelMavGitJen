package com.dv.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dvtest {

	@Test
	public  void verifyTest()
	{
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.ca/");
		
		System.out.println("===============================");
		System.out.println("                               ");  
		System.out.println("Chrome Driver Connected");
		System.out.println("Opened GOOGLE");
		System.out.println("Getting Title");
		System.out.println(driver.getTitle());
		System.out.println("Got Title");
		System.out.println(driver.getTitle());
		System.out.println("                               ");  
		System.out.println("===============================");
				
		driver.quit();
	}
}
