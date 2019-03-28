package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

		public static WebDriver driver;
		static  String   baseURL="https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html";
		
		 public static void main(String[] args) {
			 
			String exepath=".\\driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exepath);
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get(baseURL);
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][contains(text(),'Input Forms')]")).click();
			//Click on the checkbox demo link
			driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[contains(text(),'Checkbox Demo')]")).click();
			if(driver.getCurrentUrl().contains("https://www.seleniumeasy.com/test/basic-checkbox-demo.html"))
			{
				System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
			if(driver.findElement(By.id("isAgeSelected")).isSelected()) {
			System.out.println("Selected");
			}else {
				System.out.println("Button is clicked");
			driver.findElement(By.id("isAgeSelected")).click();
			
			}
			if(driver.findElement(By.id("check1")).isSelected()) {
				System.out.println("Button name changed to Uncheck All");
			}
			
			driver.findElement(By.id("check1")).click();
			System.out.println("Button name is  CheckAll ");
			
			driver.quit();
	}

}
