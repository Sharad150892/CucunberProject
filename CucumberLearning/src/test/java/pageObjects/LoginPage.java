package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	@FindBy(xpath = "//*[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[text()='Log in']")
	private WebElement loginbutton;

	public LoginPage(WebDriver driver) {
		this.ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addEmailId(String EmailID) {
		email.clear();
		email.sendKeys(EmailID);
	}

	public void addPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void clickLoginButton() {
		loginbutton.click();
	}

	public void gettitleOfTheLoginPage() {
		System.out.println(ldriver.getTitle());
	}
}
