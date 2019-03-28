package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlinAlerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://demo.automationtesting.in/Windows.html");
	   Thread.sleep(400);
	   WebElement switchToDropDown=driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
	   switchToDropDown.click();
	   
	   WebElement alertsClick=driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
	   alertsClick.click();
	   
	   WebElement alerWithOKandCanceLink=driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));
	   alerWithOKandCanceLink.click();
	   
	   WebElement confirmbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	   confirmbutton.click();
	   
	   Alert alt=driver.switchTo().alert();
	   System.out.println("Text on the alert = " +alt.getText());
	   alt.accept();
	   Thread.sleep(500);
	   driver.quit();
	   
	   

	}

}
