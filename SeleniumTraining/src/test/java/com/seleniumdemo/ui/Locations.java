package com.seleniumdemo.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locations {
	
	public static String browser = "edge";
	public static WebDriver driver;

	
	public String determineBrowser(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		return browser;
	}

	public static void main(String[] args) throws InterruptedException {
		
		Locations location = new Locations();
		location.determineBrowser(browser);
		
		//String url = "https://www.selenium.dev/documentation/";
		String url = "https://www.saucedemo.com/";
		driver.get(url);
		Thread.sleep(3000);
		// Locates anchor elements whose visible text matches the search value
		/* driver.findElement(By.linkText("Overview")).click(); */
		
		// Locates anchor elements whose visible text contains the search value. 
		//If multiple elements are matching, only the first one will be selected.
		//driver.findElement(By.partialLinkText("Web")).click();
		
		
		driver.findElement(By.id("user-name")).sendKeys("Varun");
		
	}

}
