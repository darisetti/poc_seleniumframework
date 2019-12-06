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
import com.training.pom.LoginPOMMediumcases_TC_54;

public class LoginTests_ELTC_054 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOMMediumcases_TC_54 loginPOMMediumcases_tc54;
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
		loginPOMMediumcases_tc54 = new LoginPOMMediumcases_TC_54(driver); 
		
		
	}
	
	/*@AfterMethod
	public void tearDown()  {
		
		//driver.quit();
	}*/
	@Test
	public void validLoginTests() throws InterruptedException {
		String expectedfirstname="manzoor";
		String expectedlastname="mehadi";
		String expectedfirstconnection="Jun 24, 2019";
		String expectedlastlogin="Jul 10, 2019";
		String expectedheadername="manzoor mehadi";
		String expectedteachername="manzoor mehadi (manzoor)";
		String expectedteacheremail="manzoor@gmail.com";
		String expectedcourseheader="Courses";
		String expectedsuccessfullmsg ="Your message has been sent.";
		
		loginPOMMediumcases_tc54.reporting1();
		loginPOMMediumcases_tc54.followedteachers1();
		loginPOMMediumcases_tc54.searchteacher();
		String actualfirstname=loginPOMMediumcases_tc54.actualfirstname();
		System.out.println("FIrstname on UI"+actualfirstname);
		String atuallastname=loginPOMMediumcases_tc54.actuallastname();
		System.out.println("Lastnameon UI"+atuallastname);
		String actualfirstconnection=loginPOMMediumcases_tc54.actualfirstconnection();
		System.out.println("firstconnectionon UI"+actualfirstconnection);
		String actuallatestlogin=loginPOMMediumcases_tc54.actuallatestlogin();
		System.out.println("latestlogin UI"+actuallatestlogin);
		Assert.assertEquals(actualfirstname, expectedfirstname);
		Assert.assertEquals(atuallastname, expectedlastname);
		Assert.assertEquals(actualfirstconnection, expectedfirstconnection);
		Assert.assertEquals(actuallatestlogin, expectedlastlogin);
		loginPOMMediumcases_tc54.clickdetailsicon();
		String actualheadername= loginPOMMediumcases_tc54.actualstudentheadername();
		System.out.println("Name in header "+actualheadername);
		String actualteacername=loginPOMMediumcases_tc54.actualteachername();
		System.out.println("Name "+actualteacername);
		String actualteacheremail=loginPOMMediumcases_tc54.actualteacheremail();
		System.out.println("email is "+actualteacheremail);
		Assert.assertEquals(actualheadername, expectedheadername);
		Assert.assertEquals(actualteacername, expectedteachername);
		Assert.assertEquals(actualteacheremail, expectedteacheremail);
		loginPOMMediumcases_tc54.clickcourselink();
		loginPOMMediumcases_tc54.sendemail();
		String actualsuccessfullmsg=loginPOMMediumcases_tc54.sendemail();
		System.out.println("message is "+actualsuccessfullmsg);
		Assert.assertEquals(actualsuccessfullmsg, expectedsuccessfullmsg);
		
		
		
		
		
		
		
		
		
		
		
	}

	private void Assert(String actual, String expected) {
		// TODO Auto-generated method stub
		
	}
}


