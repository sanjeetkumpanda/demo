package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String gender_male="male";
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(500);
		//System.out.println("The URL of the Page is = " +driver.getCurrentUrl());
		System.out.println("The title of the Page is = " +driver.getTitle());
		WebElement registerButton=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		registerButton.click();
		System.out.println("The current url of the Register page = :" +driver.getCurrentUrl());
		System.out.println("The title of the page ;"+driver.getTitle());
		
		WebElement fullName_first_name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fullName_first_name.sendKeys("Sanjeet");
		WebElement fullName_last_name=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		fullName_last_name.sendKeys("Panda");
		WebElement address_text=driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		address_text.sendKeys("Kishangarh, Vasant kunj, New Delhi-110070");
		WebElement email_address=driver.findElement(By.xpath("//input[@type='email']"));
		email_address.sendKeys("sanjeet.panda@gspann.com");
		WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("+91-9873423180");
		if(gender_male=="male") {
		WebElement gender_male_button=driver.findElement(By.xpath("//input[@value='Male']"));
		gender_male_button.click();
		
		System.out.println("Male button is clicked");
		}
		else
		{
			WebElement gender_female_button=driver.findElement(By.xpath("//input[@value='FeMale']"));
			gender_female_button.click();
			System.out.println("Female button is clicked");
		}
		
		WebElement hobbies_cricket=(driver.findElement(By.xpath("//input[@value='Cricket']")));
		hobbies_cricket.click();
		System.out.println("Cricket radio button is clicked");
		
		WebElement language=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		Thread.sleep(500);
		if(language.isEnabled()) {
			language.click();
			WebElement english=driver.findElement(By.xpath("//a[contains(text(),'English')]"));
			english.click();
		System.out.println("Language is English");
		Thread.sleep(500);
		WebElement confirm_password=driver.findElement(By.id("secondpassword"));
		confirm_password.click();
		}
		Thread.sleep(500);
		WebElement skills=driver.findElement(By.id("Skills"));
		skills.click();
		Select skills_select=new Select(skills);
		skills_select.selectByValue("SQL");
		System.out.println("SQL is selected");
	
		WebElement confirm_password=driver.findElement(By.id("secondpassword"));
		confirm_password.click();
		
		List<WebElement> countries=driver.findElements(By.id("countries"));
		System.out.println(countries.size());
		for(int i=0;i<countries.size();i++) {
			System.out.println(countries.get(i).getText());
		}
		
		WebElement password=driver.findElement(By.xpath("//div[12]//div[1]"));
		password.sendKeys("India123");
		WebElement confirmPassword=driver.findElement(By.id("secondpassword"));
		confirmPassword.sendKeys("India123");
		if(password== confirmPassword ) {
			System.out.println("Password is correct");
		}
		else {
			System.out.println("Password is not correct");
		}
		driver.quit();
		
		
		

	}

}
