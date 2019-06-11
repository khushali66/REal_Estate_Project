package PAGES_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PAGES.Dashboard;

public class Home_Restore {
	
WebDriver dr;
	
	By Allprop = By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[2]/a");
	By Ctrash = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[4]/a");
	By Chover = By.xpath("//*[@id=\"cb-select-3460\"]");
	By Crestore = By.xpath("//*[@id=\"post-3460\"]/td[1]/div[2]/span[1]/a");
	By Clink = By.xpath("//*[@id=\"post-query-submit\"]");
	
	public  Home_Restore(WebDriver dr){
		this.dr = dr;
	}

	public void click_Allproperties(){
		dr.findElement(Allprop).click();
	}
	
	
	public void click_trash(){
		dr.findElement(Ctrash).click();
	}
	
	public void hover_element(){
		dr.findElement(Chover).click();
	}
	
	public void click_restore(){
		dr.findElement(Crestore).click();
	}
	
	public void launch_home(){
		dr.findElement(Clink).click();
	}
	
	public void search_property(){
		dr.findElement(Clink).click();
	}
	
	 public void verify_restore(){
		Dashboard ds = new Dashboard(dr); 
		ds.click_properties();
		click_Allproperties();
		click_trash();
		hover_element();
		click_restore();
		launch_home();
		search_property();
	}

}
