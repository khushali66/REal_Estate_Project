package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Users {
	
WebDriver dr;
	
	By AllUlink = By.xpath("//*[@id=\"menu-users\"]/ul/li[2]/a");
	By AddNew = By.xpath("//*[@id=\"menu-users\"]/ul/li[3]/a");
	By Cbox = By.xpath("//*[@id=\"user_180\"]");
	By Dbox = By.xpath("//*[@id=\"user_178\"]");
	By Crole = By.xpath("//*[@id=\"new_role\"]");
	By Change = By.xpath("//*[@id=\"changeit\"]");
	By Capply = By.xpath("//*[@id=\"doaction\"]");
	
	public  Users(WebDriver dr){
		this.dr = dr;
	}

	public void click_AllUsers(){
		dr.findElement(AllUlink).click();
	}
	
	public void click_AddNew(){
		dr.findElement(AddNew).click();
	}
	
	public void click_checkbox(){
		dr.findElement(Cbox).click();
	}
	
	public void click_Dcheckbox(){
		dr.findElement(Dbox).click();
	}
	
	public void select_role(){
		Select bulk = new Select(dr.findElement(By.id("new_role")));
		bulk.selectByVisibleText("Agent");
	}
	
	public void select_delete(){
		Select bulk = new Select(dr.findElement(By.id("bulk-action-selector-top")));
		bulk.selectByVisibleText("Delete");
	}
	
	public void click_change(){
		dr.findElement(Change).click();
	}
	
	public void click_apply(){
		dr.findElement(Capply).click();
	}
	

	public void change_role(){
		Dashboard ds = new Dashboard(dr);
		ds.click_users();
		this.click_AllUsers();
		this.click_checkbox();
		this.select_role();
		this.click_change();
	}
	
	public void delete_role(){
		Dashboard ds = new Dashboard(dr);
		ds.click_users();
		this.click_AllUsers();
		this.click_Dcheckbox();
		this.select_delete();
		this.click_apply();
		Del_Users dl = new Del_Users(dr);
		dl.click_confirm();
	}
	
}
