package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.LoginPageUI;

public class UserLoginPageObject extends BasePage{
	private WebDriver driver;
	
	public UserLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public UserHomePageObject clickToLoginButton() {
		waitForElementClickabe(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getUserHomePage(driver);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
	}

	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAddress);
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public String getErrorMessageAtEmailTextboxIsNotRegisterYet() {
		waitForElementVisible(driver, LoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
	}

	public UserHomePageObject loginAsUser(String emailAddress, String password) {
		inputToEmailTextbox(emailAddress);
		inputToPasswordTextbox(password);
		return clickToLoginButton();
		
	}

}
