package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertWithTextBox {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		System.out.println("The title of the Main Window= " +driver.getTitle());
		
		WebElement switchTo=driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		switchTo.click();
		
		WebElement alertsClick=driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
		alertsClick.click();
		
		WebElement alertWithTextBox=driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		alertWithTextBox.click();
		
		WebElement promptTextBox=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptTextBox.click();
		
		Alert alt=driver.switchTo().alert();
	    System.out.println("The text in the alert =" +alt.getText());
	    alt.accept();
	    driver.quit();
		
		
	}

	
		
	}

