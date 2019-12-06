package com.training.pom;
import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMMediumcases {
	private WebDriver driver;
	
	@FindBy (id="login")
	private WebElement adminusername;
	
	@FindBy (id="password")
	private WebElement adminpassword;
	
	@FindBy (id="form-login_submitAuth")
	private WebElement adminlogin;
	
	@FindBy (xpath="//a[@href='http://elearningm1.upskills.in/main/admin/']")
	private WebElement adminclk;
	
	@FindBy (xpath="//a[@href='user_list.php']")
	private WebElement userlistclk;
	
	@FindBy (id="search_simple_keyword")
	private WebElement entrusrname;
	
	@FindBy (id="search_simple_submit")
	private WebElement clksearch;
	
	@FindBy (xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/22/edit.png' and @alt='Edit']")
	private WebElement editclk;
	
	@FindBy (id="user_edit_email")
	private WebElement  editboxclr;
	
	@FindBy (xpath="//input[@name='active' and @value='0']")
	private WebElement clkinactive;
	
	@FindBy (id="user_edit_submit")
	private WebElement savebtn;
	
	@FindBy (xpath="//div[@class='alert alert-info']")
	private WebElement savesuccessmsg;
	
	@FindBy (xpath="//a[@href='http://elearningm1.upskills.in/main/session/session_category_list.php']")
	private WebElement sessionsatlictclk;
	
	@FindBy (xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/new_folder.png']")
	private WebElement addcategoryclk;
	
	@FindBy (name="name")
	private WebElement entrcategoryname;
	
	@FindBy (xpath="//button[@class='btn btn-success' and @type='submit']")
	private WebElement clkaddcategory;
	
	@FindBy (xpath="//div[@class='alert alert-info']")
	private WebElement categorysavemsg;
	
	@FindBy (xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/session.png']")
	private WebElement trainingsessionlistclk;
	
	@FindBy (xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/new_session.png']")
	private WebElement addtrsiningseccionclk;
	
	@FindBy (id="add_session_name")
	private WebElement sessionnameenter;
	
	@FindBy (xpath="//span[@class='select2-selection__placeholder']")
	private WebElement coachnameenter;
	
	@FindBy (id="advanced_params")
	private WebElement advancedsettingbtnclk;
	
	@FindBy (xpath="(//div[@class='filter-option-inner-inner'])[2]")
	private WebElement entersessioncategories;
	
	@FindBy (xpath="(//input[@type='text' and @class='form-control'])[3]")
	private WebElement entersessionname;
	
	@FindBy (id="add_session_submit")
	private WebElement clksavebtn;
	
	@FindBy (xpath="//input[@class='select2-search__field']")
	private WebElement coachname;
	
	@FindBy (xpath="//option[@title='Testing123 (TEST1234)']")
	private WebElement selectcourselist;
	
	@FindBy (name="next")
	private WebElement clknextbtn;
	
	@FindBy (name="add_course")
	private WebElement rightarrowclk;
	
	@FindBy (id="user_to_add")
	private WebElement usersearch;
	
	@FindBy (linkText="Kumar Sunil (sunil)")
	//'Kumar Sunil (sunil)  '
	//id="user_to_add"
	////*[@id='ajax_list_users_single']/a
	////a[@href='javascript: void(0);']
	//a[@onclick='javascript: add_user_to_session('309','Kumar Sunil (sunil)  ')']
	private WebElement userselect;
	
	@FindBy (name="next")
	private WebElement finishsessioncreation;
	
	//////////////////////////////////////////
	@FindBy (xpath="//a[@href='course_category.php']")
	private WebElement coursescategories;
	
	@FindBy (xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/new_folder.png']")
	private WebElement addcategory;
	
	@FindBy (id="course_category_code")
	private WebElement categorycode;
	
	@FindBy (name="course_category_name")
	private WebElement categoryname;
	
	
	public void adminusername1(String username){
		adminusername.sendKeys(username);	
	}
	
	public void adminpassword1(String password){
		adminpassword.sendKeys(password);
	}
	
	public void adminlogin1(){
		adminlogin.click();
	}
	
	public void userlistclk1(){
		userlistclk.click();
	}
	
	public void adminclk1(){
		this.adminclk.click();
	}
	
	public void entrusrname1(String username){
		entrusrname.sendKeys(username);
	}
	
	public LoginPOMMediumcases(WebDriver driver){
		//this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	public void clksearch1(){
		clksearch.click();
	}
	
	public void editclk1(){
		editclk.click();
	}
	
	public void editboxclr1(){
		editboxclr.clear();
		editboxclr.sendKeys("sunil@gmail.com");
	}
	
	public void clkinactive1(){
		clkinactive.click();
	}
	
	public void savebtn1(){
		savebtn.click();
	}
	
	public String savesuccessmsg1(){
		return savesuccessmsg.getText();
	}
	
	public void sessionsatlictclk1(){
		sessionsatlictclk.click();
	}
	
	public  void addcategoryclk1(){
		addcategoryclk.click();
	}
	
	public void entrcategoryname1(String category){
		entrcategoryname.sendKeys(category);
		
	}
	
	public void clkaddcategory1(){
		clkaddcategory.click();
	}
	
	public String categorysavemsg1(){
		return categorysavemsg.getText();
	}
	
	public void trainingsessionlistclk1(){
		trainingsessionlistclk.click();
	}
	
	public void addtrsiningseccionclk1(){
		addtrsiningseccionclk.click();
	}
	
	public void sessionnameenter1(){
		sessionnameenter.sendKeys("selenium training100");
	}
	
	public void coachnameenter1() throws InterruptedException{
		coachnameenter.click();
		coachname.sendKeys("Goo");
		Thread.sleep(3000);
		coachname.sendKeys(Keys.ENTER);
	}
	
	public void advancedsettingbtnclk1(){
		advancedsettingbtnclk.click();
	}
	
	public void entersessioncategories1(){
		entersessioncategories.click();
	}
	
	public void entersessionname1(String category1){
		entersessionname.sendKeys(category1);
		entersessionname.sendKeys(Keys.ENTER);
		}
	
	public void clksavebtn1(){
		clksavebtn.click();
	}
	
	public void selectcourselist1(){
		selectcourselist.click();
	}
	
	public void clknextbtn1(){
		clknextbtn.click();
	}
	
	public void rightarrowclk1(){
		rightarrowclk.click();
	}
	
	public void usersearch1(String username) throws InterruptedException{
		usersearch.sendKeys(username);
		Thread.sleep(3000);
		userselect.click();
	}
	
	public void finishsessioncreation1(){
		finishsessioncreation.click();
	}
	
	public void coursescategories1(){
		coursescategories.click();
	}
	
	public void addcategory1(){
		addcategory.click();
	}
	
	public void categorycode1(String categoryCode){
		categorycode.sendKeys(categoryCode);
	}
	
	public void categoryname1(String categoryName){
		categoryname.sendKeys(categoryName);
	}
	
	
	
	
	
	
	
	


}
