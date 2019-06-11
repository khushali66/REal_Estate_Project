import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PAGES.Dashboard;
import PAGES.Login;
import PAGES_2.Del_post;
import PAGES_2.View_comments;
import PAGES_2.properties2;

public class TestNG2 {
	
	WebDriver dr;
	Dashboard ds;
	Login lg;
	properties2 pr;
	View_comments vc;
	
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
	
//	@Test(priority=2)
//    public void TC1_movetoTrash() {
//	   pr = new properties2(dr);
//	   pr.Move_trash();
//	}
	
//	@Test(priority=3)
//     public void TC2_Del_permanent() {
//	   Del_post dp = new Del_post(dr);
//	   dp.Delete_permanent();
//	}
	
	@Test(priority=3)
    public void TC4_View_comment() {
	   dr.navigate().back();
	   dr.navigate().refresh();
	   View_comments vc = new View_comments(dr);
	   vc.verify_comments();
	   dr.navigate().refresh();
	}
}
