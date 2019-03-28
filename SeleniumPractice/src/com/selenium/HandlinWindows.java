package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinWindows {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		System.out.println("The title of the Parent Windows =" +driver.getTitle());
		
		WebElement switchTo=driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		switchTo.click();
		
		WebElement window=driver.findElement(By.xpath("//a[@href='Windows.html']"));
		window.click();
		
		WebElement separateWindow=driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]"));
		separateWindow.click();
		
		WebElement clickButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickButton.click();
		
		//handlingWindows(1);
		
		Set<String> windowID=driver.getWindowHandles();
		Iterator<String> iter=windowID.iterator();
		
		String parentWindows=iter.next();
		String childWindow=iter.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println("The title of the child window is = " +driver.getTitle());
		
		driver.close();
		//handlingWindows(2);
		driver.switchTo().window(parentWindows);
		System.out.println("The title of the parent window is = " +driver.getTitle());
		
		driver.quit();
		
		}
	
	/*public static void handlingWindows(int index) {
		String WindowId=null;
		
		Set<String> windowID=driver.getWindowHandles();
		Iterator<String> iter=windowID.iterator();
		
		for(int i=1;i<=index;i++)
		{
			WindowId=iter.next();
		}
		
		driver.switchTo().window(WindowId);
		
		
	}
*/
}
