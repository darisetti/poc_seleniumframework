package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOMMediumcases;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_ELTC_052 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOMMediumcases loginPOMMediumcases;
	private static Properties properties;
	private ScreenShot screenShot;	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		/*driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		open the browser 
		driver.get("http://elearningm1.upskills.in/");
		http://elearningm1.upskills.in/main/admin/
*/		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Precondition_ELTC_005.precondition(driver);
		loginPOMMediumcases = new LoginPOMMediumcases(driver); 
		
	}
	
	/*@AfterMethod
	public void tearDown()  {
		
		//driver.quit();
	}*/
	@Test
	public void validLoginTests() throws InterruptedException {
		loginPOMMediumcases.adminclk1();
		loginPOMMediumcases.sessionsatlictclk1();
		loginPOMMediumcases.addcategoryclk1();
		String category="Testing123";
		loginPOMMediumcases.entrcategoryname1(category);
		//WebElement categoryname = loginPOMMediumcases.entrcategoryname1();
		//System.out.println(categoryname);
		loginPOMMediumcases.clkaddcategory1();
		String Expected = "The category has been added";
		Assert.assertEquals(loginPOMMediumcases.categorysavemsg1(),Expected);
		loginPOMMediumcases.trainingsessionlistclk1();
		loginPOMMediumcases.addtrsiningseccionclk1();
		loginPOMMediumcases.sessionnameenter1();
		loginPOMMediumcases.advancedsettingbtnclk1();
		loginPOMMediumcases.coachnameenter1();
		loginPOMMediumcases.entersessioncategories1();
		loginPOMMediumcases.entersessionname1(category);
		loginPOMMediumcases.clksavebtn1();
		loginPOMMediumcases.rightarrowclk1();
		loginPOMMediumcases.clknextbtn1();
		//loginPOMMediumcases.usersearch1("Sunil");
		//loginPOMMediumcases.finishsessioncreation1();
	}

	private void Assert(String actual, String expected) {
		// TODO Auto-generated method stub
		
	}
}


