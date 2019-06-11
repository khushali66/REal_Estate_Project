package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver dr;
	Dashboard ds;
	
	By btn = By.className("sign-in");
	By uname = By.xpath("//*[@id=\"user_login\"]");
	By pwd = By.xpath("//*[@id=\"user_pass\"]");
	By sign = By.name("login");
	
	public  Login(WebDriver dr){
		this.dr = dr;
	}
	
	public void click_login(){
		dr.findElement(btn).click();
	}
	
	public void set_uname(String un){
		dr.findElement(uname).sendKeys(un);
	}
	
	public void set_pwd(String pword){
		dr.findElement(pwd).sendKeys(pword);
	}
	
	public void click_btn(){
		dr.findElement(sign).click();
	}
	
	public void do_login(String u, String p){
		this.click_login();
		this.set_uname(u);
		this.set_pwd(p);
		this.click_btn();
		//ds.check_profile();
	}
}
