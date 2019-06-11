package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Dashboard {

	WebDriver dr;
	
   // By post = By.cssSelector("#//*menu-posts > a > div.wp-menu-name");
	By post =By.className("wp-menu-name");
	//By post = By.xpath("//*[@id='menu-posts']/a/div[3]");
	By Ulink = By.xpath("//*[@id=\"menu-users\"]/a/div[3]");
	By Plink = By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]");
	By profile = By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a/span");
	
	public  Dashboard(WebDriver dr){
		this.dr = dr;
	}
	
	public void click_post(){
		dr.findElement(post).click();		
	}
	
	public void click_users(){
		dr.findElement(Ulink).click();
	}
	
	public void click_properties(){
		dr.findElement(Plink).click();
	}
	
	public void check_profile(){
		String exp = "admin";
		String act = dr.findElement(profile).getText();
        Assert.assertEquals(act, exp);
	}
	
}
