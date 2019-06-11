package PAGES_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import PAGES.Dashboard;
import PAGES.Login;

public class View_comments {
	
WebDriver dr;
	
	By blog = By.xpath("//*[@id=\"menu-item-617\"]/a");
	By read = By.xpath("//*[@id=\"post-3445\"]/div/a");
	By comment = By.xpath("//*[@id=\"comment\"]");
	By Cpost = By.xpath("//*[@id=\"submit\"]");
	By Clink = By.xpath("//*[@id=\"post-query-submit\"]");
	By Cdash = By.xpath("//*[@id=\"menu-dashboard\"]/a/div[3]"); 
	By Ccomment = By.xpath("//*[@id=\"menu-comments\"]/a/div[3]"); 
	By Chover = By.xpath("//*[@id=\"comment-1774\"]/td[2]/p"); 
	By reply = By.xpath("//*[@id=\"comment-1774\"]/td[2]/div[3]/span[3]/a"); 
	By add_reply = By.xpath("//*[@id=\"replycontent\"]");
	By reply_btn = By.xpath("//*[@id=\"replybtn\"]");
	
	
	public  View_comments(WebDriver dr){
		this.dr = dr;
	}
	
	public void click_blog(){
		dr.findElement(blog).click();
	}
	
	public void click_read(){
		dr.findElement(read).click();
	}
	
	
	public void add_comment(){
		dr.findElement(comment).sendKeys("Good");
	}
	
	public void click_post(){
		dr.findElement(Cpost).click();
		dr.close();
	}
	
	public void open_site(){
		String baseUrl = "http://realestate.upskills.in";
	    dr.get(baseUrl);
	    dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	    dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
	    Login lg = new Login(dr);
		lg.do_login("admin","admin@123");
	}
	
	public void click_dashboard(){
		dr.findElement(Cdash).click();
	}
	

	public void click_comment(){
		dr.findElement(Ccomment).click();
	}
	
	public void hover_comment(){
		dr.findElement(Chover).click();
	}
	
	public void click_reply(){
		dr.findElement(reply).click();
	}
	
	public void add_reply(){
		dr.findElement(add_reply).sendKeys("Thanks");
	}
	
	public void reply_btn(){
		dr.findElement(reply_btn).sendKeys("Thanks");
	}
	
	 public void verify_comments(){
		this.click_blog();
		this.click_read();
		this.add_comment();
		this.click_post();
		this.open_site();
		this.click_dashboard();
		this.click_comment();
		this.hover_comment();
		this.click_reply();
		this.add_reply();
		this.reply_btn();		
	}

}
