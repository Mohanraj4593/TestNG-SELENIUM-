package com.abc.testingscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertDemo {

		@Test
		public void assert_demo() 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			String eTitle=driver.getTitle();
			String aTitle="Gmail";
			Assert.assertEquals(aTitle,eTitle);
		}
		
		
	}


