package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class post {
	
WebDriver dr;
	
	By Ctag = By.xpath("//*[@id=\"menu-posts\"]/ul/li[5]/a");
	By Ccbox = By.xpath("//*[@id=\"cb-select-422\"]");
	By Cbulk = By.xpath("//*[@id=\"bulk-action-selector-top\"]");
	By Sdelete = By.xpath("//*[@id=\"cb-select-283\"]");
	By Capply = By.xpath("//*[@id=\"doaction\"]");
	By Cadd = By.xpath("//*[@id=\"menu-users\"]/ul/li[3]/a");
	
	public  post(WebDriver dr){
		this.dr = dr;
	}

	public void click_tag(){
		dr.findElement(Ctag).click();
	}
	
	public void click_Add_new(){
		dr.findElement(Cadd).click();
	}
	
	public void click_checkbox(){
		dr.findElement(Ccbox).click();
	}
	
	public void select_delete(){
		Select bulk = new Select(dr.findElement(By.id("bulk-action-selector-top")));
		bulk.selectByVisibleText("Delete");
	}
	
	public void click_apply(){
		dr.findElement(Capply).click();
	}
	
	public void delete_tag(){
		Dashboard ds = new Dashboard(dr);
		ds.click_post();
		this.click_tag();
		this.click_checkbox();
		this.select_delete();
		this.click_apply();
	}
}
