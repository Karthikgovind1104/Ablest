package stepDefinitions;
import java.io.IOException;
import java.util.*;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Login_TestCase;
import static util.ConfigReader.getUrl;
import static util.ConfigReader.getPassword1;
import static util.ConfigReader.getUsername1;

public class Valid_Stepdef {
	
	public static WebDriver driver;
	

	static Login_TestCase vl;
	
	@Given("^User on login page$")
	public void user_on_login_page() throws IOException {
	 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvar\\git\\Ablest\\Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		vl =new Login_TestCase(driver);
	}

	@When("^the user enters valid username$")
	public void the_user_enters_valid_username() throws IOException {
	  
		vl.UserName(getUsername1());
		
	}

	@When("^the user enters valid password$")
	public void the_user_enters_valid_password() throws IOException {
		vl.Password(getPassword1());

	}

	@Then("^click the submit button$")
	public void click_the_submit_button() {
	vl.login();
	}


}
