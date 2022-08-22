package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.CustomerInforPageUI;

public class UserCustomerInforPageObject extends BasePage{
	private WebDriver driver;
	
	public UserCustomerInforPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isCustomerInforPageDisplayed() {
		waitForElementVisible(driver, CustomerInforPageUI.CUSTOMER_INFOR_HEADER);
		return isElementDisplayed(driver, CustomerInforPageUI.CUSTOMER_INFOR_HEADER);
	}

}
