package com.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle 
{
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void verifypageTitle(String browserName)
	{
		//Check for Firefox browser
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		//Check for Chrome browser
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			driver = new ChromeDriver();
		}
		//Check for Internet Explorer browser
		else if(browserName.equalsIgnoreCase("IE"))
		{
		      System.setProperty("webdriver.ie.driver", "./IEDriverServer.exe");
                      driver = new InternetExplorerDriver();			
		}
		
		//To load the web page
		driver.get("http://www.linkedin.com");
		//Maximize the webpage
		driver.manage().window().maximize();
		//For getting title of webpage
		System.out.println("Title: "+driver.getTitle());
		
	}
}
