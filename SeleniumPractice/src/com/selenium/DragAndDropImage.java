package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropImage {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		WebElement interatctionButton=driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
		interatctionButton.click();
		
		WebElement dropdownButton= driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")) ;
		dropdownButton.click();
		
		System.out.println("The title of the page=" +driver.getTitle());
		
		WebElement staticLink=driver.findElement(By.xpath("//a[contains(text(),'Static')]"));
		staticLink.click();
		
		System.out.println("The current URL =" +driver.getCurrentUrl());
		
		WebElement source=driver.findElement(By.xpath("//img[@id='node']"));
		WebElement destination= driver.findElement(By.xpath("//div[@id='droparea']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(source, destination);
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
			
		
		
	}

}
