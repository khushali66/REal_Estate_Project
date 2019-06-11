package PAGES_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PAGES.Dashboard;
import PAGES.Login;

public class properties2 {
	
WebDriver dr;
	
	By Allprop = By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[2]/a");
	By Ctrash = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[4]/a");
	By Chover = By.xpath("//*[@id=\"cb-select-3460\"]");
	By Crestore = By.xpath("//*[@id=\"post-3460\"]/td[1]/div[2]/span[1]/a");
	By Clink = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[1]/a");
	
	public  properties2(WebDriver dr){
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
	
	public void click_AllLink(){
		dr.findElement(Clink).click();
	}
	
	 public void Move_trash(){
		Dashboard ds = new Dashboard(dr); 
		ds.click_properties();
		this.click_Allproperties();
		this.click_trash();
		this.hover_element();
		this.click_restore();
		this.click_AllLink();
	}

}
