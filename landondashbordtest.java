package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Dashboardpage_Q1;
import page.landondashboard;
import util.BrowserFactory;

public class landondashbordtest {
	WebDriver driver;
	String pooja;
	
	@Test
	
	public void validusershouldlandonpage() throws Exception {
		driver =BrowserFactory.init();
		Thread.sleep(3000);
		
		landondashboard log =	PageFactory.initElements(driver,landondashboard.class); 
		log.alltogglecheck();
		Thread.sleep(3000);
		
		dashboardpage dsb = PageFactory.initElements(driver, dashboardpage.class);
		//dsb.validatepage();
		dsb.removebutton();
		dsb.addname("pooja");
		Thread.sleep(3000);
		dsb.clickaddcategorybutton();
		Thread.sleep(3000);
		
		
		dsb.nevermindbutton();
		Thread.sleep(3000);
		dsb.skybluebutton();
		//dsb.validateaddname();
		Thread.sleep(3000);
		BrowserFactory.teardown();	
	}
}
