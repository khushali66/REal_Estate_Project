package PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Add_new_user {
	
WebDriver dr;
	
	By uname = By.xpath("//*[@id=\"user_login\"]");
	By email = By.xpath("//*[@id=\"email\"]");
	By fname = By.xpath("//*[@id=\"first_name\"]");
	By lname = By.xpath("//*[@id=\"last_name\"]");
	By web = By.xpath("//*[@id=\"url\"]");
	By show = By.xpath("//*[@id=\"createuser\"]/table/tbody/tr[6]/td/button");
	By show1 = By.xpath("//*[@id=\"pass1-text\"]");
	By pwd = By.xpath("//*[@id=\"pass1-text\"]");
	By add = By.xpath("//*[@id=\"createusersub\"]"); 
	By v=By.id("pass1-text");
	
	public  Add_new_user(WebDriver dr){
		this.dr = dr;
	}
	
	public void set_uname(String un){
		dr.findElement(uname).sendKeys(un);
	}

	public void set_email(String email1){
		dr.findElement(email).sendKeys(email1);
	}
	
	public void set_fname(String fn){
		dr.findElement(fname).sendKeys(fn);
	}
	
	public void set_lname(String ln){
		dr.findElement(lname).sendKeys(ln);
	}
	
	public void set_website(String wb){
		dr.findElement(web).sendKeys(wb);
	}
	
	public void click_show(){
	  dr.findElement(show).click();
	  dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  dr.findElement(v).clear();
	  dr.findElement(v).sendKeys("khushali1234");	
	}
	
	public void set_pwd(String pw){
		dr.findElement(pwd).sendKeys(pw);
	}
	
	public void select_role(){
		Select bulk = new Select(dr.findElement(By.id("role")));
		bulk.selectByVisibleText("Agent");
	}
	
	public void click_adduser(){
		dr.findElement(add).click();
	}
	
	public void Add_newuser(){
		Dashboard ds;
		ds = new Dashboard(dr);
		ds.click_users();
		Users us = new Users(dr);
		us.click_AllUsers();
		us.click_AddNew();
	    this.set_uname("Srinivas Reddy");
		this.set_email("srinivasreddydharmavarapu@gmail.com");
		this.set_fname("Srinivas");
		this.set_lname("Dharmavarapu");
		this.set_website("www.google.com");
		this.click_show();
		this.select_role();
		this.click_adduser();
	}
	

}
