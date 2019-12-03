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
import com.training.pom.LoginPOMMediumcases_TC53;

public class LoginTests_ELTC_053 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOMMediumcases_TC53 loginPOMMediumcases_tc53;
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
		loginPOMMediumcases_tc53 = new LoginPOMMediumcases_TC53(driver); 
		
	}
	
	/*@AfterMethod
	public void tearDown()  {
		
		//driver.quit();
	}*/
	@Test
	public void validLoginTests() {
		String expectedfirstname="Mausumi";
		String expectedlastname="Acharya";
		String expectedfirstconnection="Nov 09, 2019";
		String expectedlastlogin="Nov 09, 2019";
		String expectedheadername="Mausumi Acharya";
		String expectedstudentname="Mausumi Acharya (Mausumi)";
		String expectedstudentemail="mausumi.ac2@gmail.com";
		String expectedcourseheader="Courses";
		String expectedsuccessfullmsg ="Your message has been sent.";
		
		loginPOMMediumcases_tc53.reporting1();
		loginPOMMediumcases_tc53.followedstudents1();
		loginPOMMediumcases_tc53.searchstudent();
		String actualfirstname=loginPOMMediumcases_tc53.actualfirstname();
		System.out.println("FIrstname on UI"+actualfirstname);
		String atuallastname=loginPOMMediumcases_tc53.actuallastname();
		System.out.println("Lastnameon UI"+atuallastname);
		String actualfirstconnection=loginPOMMediumcases_tc53.actualfirstconnection();
		System.out.println("firstconnectionon UI"+actualfirstconnection);
		String actuallatestlogin=loginPOMMediumcases_tc53.actuallatestlogin();
		System.out.println("latestlogin UI"+actuallatestlogin);
		Assert.assertEquals(actualfirstname, expectedfirstname);
		Assert.assertEquals(atuallastname, expectedlastname);
		Assert.assertEquals(actualfirstconnection, expectedfirstconnection);
		Assert.assertEquals(actuallatestlogin, expectedlastlogin);
		loginPOMMediumcases_tc53.clickdetailsicon();
		String actualheadername= loginPOMMediumcases_tc53.actualstudentheadername();
		System.out.println("Name in header "+actualheadername);
		String actualstudentname=loginPOMMediumcases_tc53.actualstudentname();
		System.out.println("Name "+actualstudentname);
		String actualstudentemail=loginPOMMediumcases_tc53.actualstudentemail();
		System.out.println("email is "+actualstudentemail);
		Assert.assertEquals(actualheadername, expectedheadername);
		Assert.assertEquals(actualstudentname, expectedstudentname);
		Assert.assertEquals(actualstudentemail, expectedstudentemail);
		loginPOMMediumcases_tc53.clickcourselink();
		loginPOMMediumcases_tc53.sendemail();
		String actualsuccessfullmsg=loginPOMMediumcases_tc53.sendemail();
		System.out.println("message is "+actualsuccessfullmsg);
		Assert.assertEquals(actualsuccessfullmsg, expectedsuccessfullmsg);
		
		
		
		
		
		
		
		
		
		
		
	}

	private void Assert(String actual, String expected) {
		// TODO Auto-generated method stub
		
	}
}


