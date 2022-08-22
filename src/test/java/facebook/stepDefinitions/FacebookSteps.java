package facebook.stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	
	@Before("@login")
	public void open_facebook_application()  {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After("@login")
	public void closeApplication()  {
		driver.quit();
	}
	
	@When("^Input to Username textbox$")
	public void input_to_username_textbox()  {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("automationtest@gmail.com");
	}
	
	@When("^Input to Password textbox$")
	public void input_to_password_textbox()  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("123456");
	}
	
	@When("^Click to submit button$")
	public void click_to_submit_button()  {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@When("^Input to Username textbox with \"([^\"]*)\"$")
	public void input_to_username_textbox_with_something(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}
	
	@And("^Input to Password textbox with \"([^\"]*)\"$")
	public void input_to_password_textbox_with_something(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
    @When("^Input to Username textbox with ([^\"]*)$")
    public void input_to_username_textbox(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
    }

    @And("^Input to Password textbox with ([^\"]*)$")
    public void input_to_password_textbox(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
    }
    
    @When("^Input to Username textbox with \"([^\"]*)\" and Password textbox with \"([^\"]*)\"$")
    public void input_to_username_textbox_with_something_and_password_textbox_with_something(String email, String password){
    	driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
    }
    
    @When("^Input to Username and Password$")
    public void inputToUsernameAndPassword(DataTable table){
    	List<Map<String, String>> customer = table.asMaps(String.class, String.class);
    	
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(customer.get(0).get("Username"));
    	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(customer.get(0).get("Password"));	
    }
}
