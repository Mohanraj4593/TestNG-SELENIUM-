package com.abc.testingscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

WebDriver driver;
	
	@BeforeTest
	@Parameters("browser_parameter")
	public void browserTest(String browser) 
	{
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			driver=new ChromeDriver();
		}
		else {
		driver=new FirefoxDriver();
		}
		
		}
	
	@Test
	public void magento() 
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.id("email")).sendKeys("sharonvictoria0692@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome@1234");
		driver.findElement(By.id("send2")).click();
		
		driver.findElement(By.linkText("Log Out")).click();
		
	}


}
