package nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumberOptions.Hooks;
import pageObjects.PageGeneratorManager;
import pageObjects.UserHomePageObject;

public class HomePageSteps {
	WebDriver driver;
	UserHomePageObject homePage;
	
	protected HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getUserHomePage(driver);
	}
	
	@Given("^Open Register page$")
	public void openRegisterPage() {
		homePage.openRegisterPage();
	}
}
