package com.training.pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[contains(@href,'http://elearningm1.upskills.in/main/auth/lostPassword.php')]")
	private WebElement forgotPwdBtn;
	
	@FindBy(name="user")
	private WebElement UsrnmeEmailadd;
	
	@FindBy(id="lost_password_submit")
	private WebElement clksendmsg;
	
	@FindBy (xpath="//div[@class='alert alert-info']")
	private WebElement msgvalidation;
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")
	private WebElement signup;
	
	@FindBy(id="registration_firstname")
	private WebElement firstname;
	
	@FindBy(id="registration_lastname")
	private WebElement lastname;
	
	@FindBy(id="registration_email")
	private WebElement regemail;
	
	@FindBy(id="username")
	private WebElement regusername;
	
	@FindBy(id="pass1")
	private WebElement regpassword;
	
	@FindBy(id="pass2")
	private WebElement regconfpassword;
	
	@FindBy(id="registration_phone")
	private WebElement phnno;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement reglang;
	
	@FindBy(xpath="//input[@class='form-control' and @role='textbox']")
	private WebElement enterlang;
	
	@FindBy(xpath="(//*[@class='register-profile'])[2]")
	//
	private WebElement regradio;
	//Select selectradio = new Select(regradio);
	
	@FindBy (xpath="//em[@class='fa fa-arrow-right']")
	private WebElement regclick;
	
	
	
	public void firstname1(){
		this.firstname.sendKeys("harsh");
			
	}
	
	public void lastname1(){
		this.lastname.sendKeys("Dari");
		String reglastname=lastname.getText();
		
	}
	
	public void regemail1(){
		this.regemail.sendKeys("harshDari@gmail.com");
	}
	
	public void regusername1(){
		this.regusername.sendKeys("harsh456");
	}
	
	public void regpassword1(){
		this.regpassword.sendKeys("reva321");
	}
	
	public void regconfpassword1(){
		this.regconfpassword.sendKeys("reva321");
	}
	
	public void phnno(){
		this.phnno.sendKeys("9876543210");
	}
	
	public void reglang1(){
		this.reglang.click();
		this.enterlang.sendKeys("English",Keys.ENTER);
	}
	
	public void regradio1(){
		this.regradio.click();
		}
	
	public void regclick1(){
		this.regclick.click();
		}
	
	public void signup1(){
		this.signup.click();
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void clickForgotPwdBtn(){
		this.forgotPwdBtn.click();
	}
	public void UsrnmeEmailadd(){
		this.UsrnmeEmailadd.sendKeys("reva");
	}
	public void clksendmsg(){
		this.clksendmsg.click();
	}
	public String getmsg(){
		return this.msgvalidation.getText();
		//System.out.println(Actual);
		//return Actual;
	}
	
	
}
