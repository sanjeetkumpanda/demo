package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
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
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[contains(text(),'Simple Form Demo')]")).click();
		//Validating the text present in webpage
		if(driver.getPageSource().contains("Your Message:")) {
			System.out.println("You are in the right page");
			System.out.println("Test Pass");
			
		}
		else {
			System.out.println("You are in wrong page");
			System.out.println("Test Fail");
		}
		//Entering the text to the text field
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hi This is selenium");
		//click on the show message button
		WebElement showMessage=driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
		showMessage.click();
		System.out.println("Hi This is selenium");
		
		//Entering the value to field a
		driver.findElement(By.id("sum1")).sendKeys("10");
		driver.findElement(By.id("sum2")).sendKeys("20");
		
		//Click on Get Total button
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
		
		//Refress the page
		driver.navigate().refresh();
		System.out.println("Refresh the page");
		//Navigate to back
		driver.navigate().back();
		System.out.println("Going back");
		//Navigate to forward
		driver.navigate().forward();
		System.out.println("Click on the forward button");

		
		driver.quit();
		

	}

}
