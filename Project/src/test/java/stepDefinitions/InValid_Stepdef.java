package stepDefinitions;

import org.openqa.selenium.WebDriver;

import static util.ConfigReader.getUrl;
import static util.ConfigReader.getPassword2;
import static util.ConfigReader.getUsername2;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Login_TestCase;

public class InValid_Stepdef {

public static WebDriver driver;
	
	static Login_TestCase vl;
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {
	 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvar\\git\\Ablest\\Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		vl =new Login_TestCase(driver);
	}

	@When("the user enters invalid username")
	public void the_user_enters_invalid_username() throws IOException {
	  
		vl.UserName(getUsername2());

	}

	@When("the user enters invalid password")
	public void the_user_enters_invalid_password() throws IOException {
		vl.Password(getPassword2());
	}

	@Then("click on the submit button")
	public void click_on_the_submit_button() {
		vl.login();

	}


}
