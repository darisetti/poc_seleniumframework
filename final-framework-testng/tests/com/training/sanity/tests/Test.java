package com.training.sanity.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//DarisettiHarshini//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elearningm1.upskills.in/main/auth/inscription.php");
		
		driver.findElement(By.xpath("//div[@class='filter-option-inner-inner']")).click();
		driver.findElement(By.xpath("//input[@class='form-control' and @role='textbox']")).sendKeys("Deutsch",Keys.ENTER);
		driver.findElement(By.xpath("(//*[@class='register-profile'])[2]")).click();
		
		
		

	}

}
