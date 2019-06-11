package TEST;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PAGES.Add_new_user;
import PAGES.Login;
import PAGES.Users;
import PAGES.post;
import PAGES.properties;

public class Test_firefox {
  
	 WebDriver dr;
	 String autURL1, nodeURL1;
	 
@BeforeMethod
public void LaunchFirefox() throws MalformedURLException {
	  autURL1 = "http://realestate.upskills.in";
	  nodeURL1 = "http://172.24.94.23:5566/wd/hub";
	  DesiredCapabilities cap = DesiredCapabilities.firefox();
	  cap.setBrowserName("firefox");
	  cap.setPlatform(Platform.WINDOWS);
	  dr = new RemoteWebDriver(new URL(nodeURL1), cap);
	  dr.get(autURL1);
	  valid_details();
}

public void valid_details() {	  	
	  Login lg = new Login(dr);
	  lg.do_login("admin","admin@123");
	  //ds.check_profile();
	}

//@Test(priority=0)
//public void Test_case_1(){
//	post pt = new post(dr);
//		pt.delete_tag();
//		dr.close();
//}

@Test(priority=1)
public void Test_case_2(){
	Users us = new Users(dr);
		us.change_role();
		dr.quit();
}

@Test(priority=2)
public void Test_case_3(){
	Users us = new Users(dr);
		us.delete_role();
		dr.quit();
}

@Test(priority=3)
public void Test_case_4(){
	 Add_new_user ad = new Add_new_user(dr);
		ad.Add_newuser();
		dr.quit();
}

@Test(priority=4)
public void Test_case_5(){
  properties pr = new properties(dr);
    pr.Filter_prop();
    dr.quit();
}
}
