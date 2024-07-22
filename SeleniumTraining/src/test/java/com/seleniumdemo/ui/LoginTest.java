package com.seleniumdemo.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
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
		
		LoginTest loginTest = new LoginTest();
		loginTest.determineBrowser(browser);
		
			
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
