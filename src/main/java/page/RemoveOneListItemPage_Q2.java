package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveOneListItemPage_Q2 {
	WebDriver driver;

	public RemoveOneListItemPage_Q2(WebDriver driver) {
		this.driver = driver;
	}

	// Test 2: Validate that a single list item could be removed using the remove
	// button when a single checkbox is selected.
	
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")
	WebElement CHECKBOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_ELEMENT;


	public void validateSingalItemCheckbox() {
		CHECKBOX_ELEMENT.click();
	}

	public void removebutton() {
		REMOVE_ELEMENT.click();
	}

	

}
