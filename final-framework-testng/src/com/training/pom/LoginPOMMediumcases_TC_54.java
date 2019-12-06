package com.training.pom;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMMediumcases_TC_54 {
	@FindBy (xpath="//a[@href='http://elearningm1.upskills.in/main/mySpace/']")
	private WebElement reporting;
	
	@FindBy (linkText="Followed teachers")
	//xpath="//a[@href='http://elearningm1.upskills.in/main/mySpace/student.php']"
	private WebElement followedteachers;
	
	@FindBy (id="search_user_keyword")
	private WebElement enterkeyword;
	
	@FindBy (id="search_user_submit")
	private WebElement clicksearch;
	
	@FindBy (xpath="(//a[@href='http://elearningm1.upskills.in/main/mySpace/myStudents.php?student=15&origin=teacher_details'])[1]")
	//*[@id="tracking_student5de67e201b55e"]/tbody/tr[4]/td[1]/a
	private WebElement firstname;
	
	@FindBy (xpath="(//a[@href='http://elearningm1.upskills.in/main/mySpace/myStudents.php?student=15&origin=teacher_details'])[2]")
	private WebElement lastname;
	
	@FindBy (xpath="//table[@class='table table-bordered data_table']//tbody/tr[2]/td[3]")
	private WebElement firstconnection;
	
	@FindBy (xpath="//table[@class='table table-bordered data_table']//tbody/tr[2]/td[4]")
	private WebElement latestlogin;
	
	@FindBy (xpath="(//img[@src='http://elearningm1.upskills.in/main/img/icons/22/2rightarrow.png'])[1]")
	private WebElement detailsbutton;
	
	@FindBy (xpath="(//h3)[1]")
	private WebElement teachernameheader;
	
	@FindBy (xpath="//a[contains(text(),'manzoor mehadi (manzoor)')]")
	private WebElement teachername;
	
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
	
	
	
	private WebDriver driver;
	

	 public  LoginPOMMediumcases_TC_54(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void reporting1(){
			reporting.click();
		}
	 
	 public void followedteachers1(){
		 followedteachers.click();
	 }
	 
	 public void searchteacher(){
		 enterkeyword.sendKeys("Manzoor");
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
		return teachernameheader.getText();
		 }
	 
	 public String actualteachername(){
		return teachername.getText();
		 }
	 
	 public String actualteacheremail(){
		return studentemail.getText();
		 }
	 
	 public String actualcourseheader(){
		 return  courseheader.getText();
	 }
	 
	 public void clickcourselink(){
		      courselink.click();
	 }
	 
	 public String sendemail() throws InterruptedException{
		 try {
		 teachername.click();
		 subject.sendKeys("test");
			Message.sendKeys("testing");
			sendmessage.click();
		
		 }
		 catch (ElementClickInterceptedException e){
		 }
			return messagesent.getText();
		 }
		
		/*Set<String> parentwindow= driver.getWindowHandles();
		ArrayList <String> messagewindow = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(messagewindow.get(1));*/
		
		
		//driver.switchTo().window(driver.getWindowHandle());
		
			
		 
		 
	 }
	 


