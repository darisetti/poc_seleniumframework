package com.training.sanity.tests;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Precondition_ELTC_005 {

	public static void precondition(WebDriver driver) {
		// TODO Auto-generated method stub
		 //WebDriver driver;
		 
		
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver.get("http://elearningm1.upskills.in/");
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).sendKeys(Keys.ENTER);


	}

}
