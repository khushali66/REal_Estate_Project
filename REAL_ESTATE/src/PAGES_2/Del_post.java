package PAGES_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PAGES.Dashboard;

public class Del_post {
	
WebDriver dr;
	
	By Allprop = By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[2]/a");
	By Chover = By.xpath("//*[@id=\"cb-select-3460\"]");
	By Ctrash = By.xpath("//*[@id=\"post-3460\"]/td[1]/div[3]/span[3]/a");
	By Ttrash = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[4]/a");
	By Thover = By.xpath("//*[@id=\"cb-select-3461\"]");
	By Del_per = By.xpath("//*[@id=\"post-3461\"]/td[1]/div[2]/span[2]/a");
	
	public  Del_post(WebDriver dr){
		this.dr = dr;
	}

	public void click_Allproperties(){
		dr.findElement(Allprop).click();
	}
	
	public void hover_element(){
		dr.findElement(Chover).click();
	}
	
	public void click_trash(){
		dr.findElement(Ctrash).click();
	}
	
	public void view_trash(){
		dr.findElement(Ttrash).click();
	}

	public void mouse_hover(){
		dr.findElement(Thover).click();
	}
	
	public void click_deleteLink(){
		dr.findElement(Del_per).click();
	}
	
	 public void Delete_permanent(){
		Dashboard ds = new Dashboard(dr); 
		ds.click_properties();
		click_Allproperties();
		hover_element();
		click_trash();
		view_trash();
		mouse_hover();
		click_deleteLink();
	}

}
