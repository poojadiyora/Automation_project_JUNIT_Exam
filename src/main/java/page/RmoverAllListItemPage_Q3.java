package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RmoverAllListItemPage_Q3 {
	WebDriver driver;

	public RmoverAllListItemPage_Q3(WebDriver driver) {
		this.driver = driver;
	}

	// Test 3: Validate that all list item could be removed using the remove button
	//and when "Toggle All" functionality is on.
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement ALL_TOGGLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_ALL_LIST_ELEMENT;

	public void alltogglecheck() {
		ALL_TOGGLE_ELEMENT.click();

	}

	public void removerAllListItemes() {
		REMOVE_ALL_LIST_ELEMENT.click();
	}

}
