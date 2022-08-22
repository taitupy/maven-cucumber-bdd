package nopcommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.PageGeneratorManager;
import pageObjects.UserRegisterPageObject;

public class RegisterPageSteps {
	WebDriver driver;
	String username, password;
	UserRegisterPageObject registerPage;
	
	protected RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getUserRegisterPage(driver);
	}
	
	@When("^Input to first name textbox$")
	public void inputToFirstNameTextbox() {
		registerPage.inputToFirstnameTextbox("");
	}

	@When("^Input to last name textbox$")
	public void inputToLastNameTextbox() {
		registerPage.inputToLastnameTextbox("");
	}

	@When("^Input to email textbox$")
	public void inputToEmailTextbox() {
		registerPage.inputToEmailTextbox("");
	}

	@When("^Input to password textbox$")
	public void inputToPasswordTextbox() {
		registerPage.inputToPasswordTextbox("");
	}

	@When("^Input to confirm password textbox$")
	public void inputToConfirmPasswordTextbox() {
		registerPage.inputToConfirmPasswordTextbox("");
	}

	@When("^Click to Register button$")
	public void clickToRegisterButton() {
		registerPage.clickToRegisterButton();
	}
	
	@Then("^Register account completed displayed$")
	public void registerAccountCompletedDisplayed() {
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
	}
}










