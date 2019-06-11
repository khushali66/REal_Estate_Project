package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class properties {
	
WebDriver dr;
	
	By Allprop = By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[2]/a");
	By Pbox = By.xpath("//*[@id=\"cb-select-3788\"]");
	By alldate = By.xpath("//*[@id=\"filter-by-date\"]");
	By Fapply = By.xpath("//*[@id=\"post-query-submit\"]");
	By Ctrash = By.xpath("//*[@id=\"post-query-submit\"]");
	
	public  properties(WebDriver dr){
		this.dr = dr;
	}

	public void click_Allproperties(){
		dr.findElement(Allprop).click();
	}
	
	
	public void click_date(){
		dr.findElement(alldate).click();
	}
	
	public void select_date(){
		Select bulk = new Select(dr.findElement(By.id("filter-by-date")));
		bulk.selectByVisibleText("March 2018");
	}
	
	public void click_apply(){
		dr.findElement(Fapply).click();
	}
	
	 public void Filter_prop(){
		Dashboard ds = new Dashboard(dr); 
		ds.click_properties();
		this.click_Allproperties();
		this.click_date();
		this.select_date();
		this.click_apply();
	}
	

}
