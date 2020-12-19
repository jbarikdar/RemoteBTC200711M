import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	WebDriver driver;
	
	@Given("^open browser$")
	public void open_browser()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manna\\Documents\\JavaLibrary\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("^Navigate to url$")
	public void navigate_to_url()  {
		driver.get("http://www.facebook.com");

	}

	@When("^user type userid in textbox$")
	public void user_type_userid_in_textbox()  {
		driver.findElement(By.id("email")).sendKeys("userId");
	}

	@When("^User type password in textbox$")
	public void user_type_password_in_textbox()  {
		driver.findElement(By.id("pass")).sendKeys("password");
	}

	@When("^User click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.id("u_0_2")).click();

	}

	@Then("^User should land in profile page$")
	public void user_should_land_in_profile_page()  {
		System.out.println("profile page");
	}
	
	@Then("^User should not land in profile page$")
	public void user_should_not_land_in_profile_page()  {
		System.out.println("Not profile page");
	}
	@When("^user type <\"([^\"]*)\"> in user textbox$")
	public void user_type_in_user_textbox(String arg1){
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^User type <\"([^\"]*)\"> in pass textbox$")
	public void user_type_in_pass_textbox(String arg1){
		driver.findElement(By.id("pass")).sendKeys(arg1);

	}
}
