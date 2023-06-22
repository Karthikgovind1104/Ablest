package testCases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.*;

import objects.Login_TestCase;
import static util.ConfigReader.getUrl;
import static util.ConfigReader.getUsername1;
import static util.ConfigReader.getPassword1;
import static util.ConfigReader.getUsername2;
import static util.ConfigReader.getPassword2;

public class Valid_Testcase {
	
	public static WebDriver driver ;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvar\\git\\Ablest\\Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		Login_TestCase vl = new Login_TestCase(driver);
		vl.UserName(getUsername1());
		vl.Password(getPassword1());
		vl.login();
	}



}
