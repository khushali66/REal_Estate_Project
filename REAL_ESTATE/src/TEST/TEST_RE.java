package TEST;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PAGES.Add_new_user;
import PAGES.Dashboard;
import PAGES.Del_Users;
import PAGES.Login;
import PAGES.Users;
import PAGES.post;
import PAGES.properties;


public class TEST_RE {
  
	WebDriver dr;
	Dashboard ds;
	Login lg;
	post pt;
	Users us;
	Del_Users dl;
	Add_new_user ad;
	properties pr;
	
	@BeforeClass
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://realestate.upskills.in/");	

		}
	
	@Test(priority=1)
    public void valid_details() {	  	
	  lg = new Login(dr);
	  lg.do_login("admin","admin@123");
	  //ds.check_profile();
	}
	
	@Test(priority=2)
    public void TC1_delete_tag() {
		pt = new post(dr);
		pt.delete_tag();
	}
	
//	@Test(priority=2)
//    public void TC2_change_role() {
//		us = new Users(dr);
//		us.change_role();
//	}
	
//	@Test(priority=3)
//    public void TC3_delete_role() {
//		us = new Users(dr);
//		us.delete_role();
//	}
//	
//	@Test(priority=4)
//     public void TC4_add_user() {
//		ad = new Add_new_user(dr);
//		ad.Add_newuser();
//	}
//	
//	@Test(priority=5)
//    public void TC5_Filter_prop() {
//		pr = new properties(dr);
//        pr.Filter_prop();	
//	}
//	


}
