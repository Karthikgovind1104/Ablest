package objects;

import org.openqa.selenium.By;




import org.openqa.selenium.WebDriver;

public class Login_TestCase  {

	WebDriver driver;
	
	public Login_TestCase(WebDriver driver) {
		this.driver = driver;
	}
	
	By uName = By.xpath("//input[@type='text']");
	By Pword = By.xpath("//input[@type='password']");
	By submit = By.xpath("//input[@type='submit']");
	
	public  void UserName(String user) {
		driver.findElement(uName).sendKeys(user);
	}
	
	public  void Password(String pass) {
		driver.findElement(Pword).sendKeys(pass);
	}
	
	public  void login() {
		driver.findElement(submit).click();
		driver.close();
	}
	
}
