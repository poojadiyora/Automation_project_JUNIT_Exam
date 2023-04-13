package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveOneListItemPage_Q2;
import page.RmoverAllListItemPage_Q3;
import page.Dashboardpage_Q1;
import util.BrowserFactory;

public class Landondashbordtest {
	WebDriver driver;

	String Name = "advait";

	@Test

	public void userShouldLandOnDashboardPage() throws Exception {
		driver = BrowserFactory.init();
		Dashboardpage_Q1 dsb = PageFactory.initElements(driver, Dashboardpage_Q1.class);
		dsb.addName(Name);
		dsb.clickAddButton();
		dsb.validateSingalItemCheckbox();
		Thread.sleep(3000);
		dsb.alltogglecheck();

		RemoveOneListItemPage_Q2 qes = PageFactory.initElements(driver, RemoveOneListItemPage_Q2.class);
		qes.validateSingalItemCheckbox();
		qes.removebutton();

		RmoverAllListItemPage_Q3 ral = PageFactory.initElements(driver, RmoverAllListItemPage_Q3.class);
		ral.alltogglecheck();
		ral.removerAllListItemes();

	}
	


}
