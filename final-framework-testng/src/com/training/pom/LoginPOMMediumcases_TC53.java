package com.training.pom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMMediumcases_TC53 {
	public WebDriver driver;
	
	@FindBy (xpath="//a[@href='http://elearningm1.upskills.in/main/mySpace/']")
	private WebElement reporting;
	
	@FindBy (xpath="//a[@href='http://elearningm1.upskills.in/main/mySpace/student.php']")
	private WebElement followedstudents;
	
	@FindBy (id="search_user_keyword")
	private WebElement enterkeyword;
	
	@FindBy (id="search_user_submit")
	private WebElement clicksearch;
	
	@FindBy (xpath="(//a[@href='http://elearningm1.upskills.in/main/mySpace/myStudents.php?student=349'])[1]")
	//*[@id="tracking_student5de67e201b55e"]/tbody/tr[4]/td[1]/a
	private WebElement firstname;
	
	@FindBy (xpath="(//a[@href='http://elearningm1.upskills.in/main/mySpace/myStudents.php?student=349'])[2]")
	private WebElement lastname;
	
	@FindBy (xpath="//table[@class='table table-bordered data_table']//tbody/tr[4]/td[3]")
	
	private WebElement firstconnection;
	
	@FindBy (xpath="//table[@class='table table-bordered data_table']//tbody/tr[4]/td[4]")
	private WebElement latestlogin;
	
	@FindBy (xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/22/2rightarrow.png' and @title='Details Mausumi']")
	private WebElement detailsbutton;
	
	@FindBy (xpath="(//h3)[1]")
	private WebElement studentnameheader;
	
	@FindBy (xpath="//a[@href='http://elearningm1.upskills.in/main/inc/ajax/user_manager.ajax.php?a=get_user_popup&user_id=349']")
	private WebElement studentname;
	
	@FindBy (xpath="//p[@class='email']")
	private WebElement studentemail;
	
	@FindBy (xpath="(//h3)[4]")
	private WebElement courseheader;
	
	@FindBy (xpath="(//img[@src='http://elearningm1.upskills.in/main/img/icons/22/2rightarrow.png'])[1]")
	private WebElement courselink;
	
	@FindBy (id="subject_id")
	private WebElement subject;
	
	@FindBy (id="content_id")
	private WebElement Message;
	
	@FindBy (id="send_message_link")
	private WebElement sendmessage;
	
	@FindBy (xpath="//div[@class='alert alert-success']")
	private WebElement messagesent;
	
	
	
	
	

	 public LoginPOMMediumcases_TC53(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void reporting1(){
			reporting.click();
		}
	 
	 public void followedstudents1(){
		 followedstudents.click();
	 }
	 
	 public void searchstudent(){
		 enterkeyword.sendKeys("Mausumi");
		 clicksearch.click(); 
	 }
	 
	 public  String actualfirstname(){
		return firstname.getText();
	 }
	 
	 public  String actuallastname(){
			return lastname.getText();
		 }
	 
	 public  String actualfirstconnection(){
			return firstconnection.getText();
		 }
	 
	 public  String actuallatestlogin(){
			return latestlogin.getText();
		 }
	 
	 public  void clickdetailsicon(){
			 detailsbutton.click();
		 }
	 
	 public String actualstudentheadername(){
		return studentnameheader.getText();
		 }
	 
	 public String actualstudentname(){
		return studentname.getText();
		 }
	 
	 public String actualstudentemail(){
		return studentemail.getText();
		 }
	 
	 public String actualcourseheader(){
		 return  courseheader.getText();
	 }
	 
	 public void clickcourselink(){
		      courselink.click();
	 }
	 
	 public String sendemail(){
		 studentname.click();
		/*Set<String> parentwindow= driver.getWindowHandles();
		ArrayList <String> messagewindow = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(messagewindow.get(1));*/
		
		
		//driver.switchTo().window(driver.getWindowHandle());
		
		subject.sendKeys("test");
		Message.sendKeys("testing");
		sendmessage.click();
		return messagesent.getText();	
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	

}
