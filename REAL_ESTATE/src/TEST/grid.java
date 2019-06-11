package TEST;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PAGES.Dashboard;
import PAGES.Login;
import PAGES.post;

public class grid {
	 WebDriver dr;
	 String autURL1, nodeURL1,autURL, nodeURL,autURL2, nodeURL2;
	 Login lg1;
	 post pst;
	  
//	  @Test
//	  public void setup1() throws MalformedURLException {
//		  autURL1 = "http://realestatem1.upskills.in";
//		  nodeURL1 = "http://172.24.92.9:5566/wd/hub";
//		  DesiredCapabilities cap = DesiredCapabilities.chrome();
//		  cap.setBrowserName("chrome");
//		  cap.setPlatform(Platform.WINDOWS);
//		  dr = new RemoteWebDriver(new URL(nodeURL1), cap);
//		  dr.get(autURL1);
//		  lg1 = new Login(dr);
//		  lg1.do_login("admin", "admin@123");
//		  pst = new post(dr);
//		  pst.test1();
	 // }
	  
	  @Test
	  public void setup() throws MalformedURLException {
		  autURL2 = "http://realestatem1.upskills.in";
		  nodeURL2 = "http://172.24.92.9:5566/wd/hub";
		  DesiredCapabilities cap = DesiredCapabilities.chrome();
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		  dr = new RemoteWebDriver(new URL(nodeURL2), cap);
		  dr.get(autURL2);
		 // ts.valid_details();
	  }
//	  
//	  @Test
//	  public void setup2() throws MalformedURLException {
//		  autURL = "http://realestatem1.upskills.in";
//		  nodeURL = "http://172.24.94.41:5566/wd/hub";
//		  DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
//		  cap.setBrowserName("internet explorer");
//		  cap.setPlatform(Platform.WINDOWS);
//		  dr = new RemoteWebDriver(new URL(nodeURL), cap);
//		  dr.get(autURL);
//		 // ts.valid_details();
//	  }
//	  
	  
//	  @Test
//	  public void test1(){
//		  dr.get(autURL);
//	  }
}
