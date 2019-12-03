package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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

public class LoginTests_ELTC_051 {
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
	public void validLoginTests() {
		loginPOMMediumcases.userlistclk1();
		loginPOMMediumcases.entrusrname1("Sunil");
		loginPOMMediumcases.clksearch1();
		loginPOMMediumcases.editclk1();
		loginPOMMediumcases.editboxclr1();
		loginPOMMediumcases.clkinactive1();
		loginPOMMediumcases.savebtn1();
		String Actual=loginPOMMediumcases.savesuccessmsg1();
		String Expected ="User updated: Sunil Kumar (sunil)";
		Assert.assertEquals(loginPOMMediumcases.savesuccessmsg1(),Expected);
		
		
		//Thread.sleep(10000);
		//driver.quit();
		
	}

	private void Assert(String actual, String expected) {
		// TODO Auto-generated method stub
		
	}
}


