package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboardpage_Q1 extends BasePage {
	WebDriver driver;

	public Dashboardpage_Q1(WebDriver driver) {
		this.driver = driver;
	}
	// Test 1: Validate when the toggle all check box is CHECKED, all check boxes
	// for list items are also CHECKED ON.

	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement ADD_CLICK_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")
	WebElement CHECKBOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement ALL_TOGGLE_ELEMENT;

	public void addName(String name) {
		String insertName = name + generateRandomNum(999);
		ADD_NAME_ELEMENT.sendKeys(insertName);
	}

	public void clickAddButton() {
		ADD_CLICK_ELEMENT.click();
	}

	public void validateSingalItemCheckbox() {
		CHECKBOX_ELEMENT.click();
	}

	public void alltogglecheck() {
		ALL_TOGGLE_ELEMENT.click();
	}

}
