package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Del_Users {

WebDriver dr;
	
	By Duser = By.xpath("//*[@id=\"submit\"]");
	
	public  Del_Users(WebDriver dr){
		this.dr = dr;
	}
	
	public void click_confirm(){
		dr.findElement(Duser).click();
	}
}
