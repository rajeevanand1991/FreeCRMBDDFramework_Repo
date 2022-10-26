package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class LoginStepDefinition {

WebDriver driver;

	@Given("^user is already available on login page$")
	public void user_already_on_login_page() {
		
	System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
	}	
}