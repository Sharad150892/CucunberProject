package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.BaseClass;

public class LoginStepDef extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	BaseClass bs;

	@Given("^User launch browser$")
	public void launch_browser() {
		this.bs = new LoginStepDef();
		driver = bs.initialization();
		this.lp = new LoginPage(driver);
		this.hp = new HomePage(driver);
	}

	@And("^User opens URL \\\"(.*)\\\"$")
	public void open_url(String url){
		driver.get(url);	
	}

	@When("^User add Email \\\"(.*)\\\" and password \\\"(.*)\\\"$")
	public void add_email_and_password(String email, String pass) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.addEmailId(email);
		lp.addPassword(pass);
	}
	
	@When("^User add Email and password$")
	public void add_email_and_password_using_Dataprovider(DataTable table) {
		List<String> L1 = table.asList();
		lp.addEmailId(L1.get(0));
		lp.addPassword(L1.get(1));
	}
	
	@And("^Login Page tile captured$")
	public void title_capture() {
		lp.gettitleOfTheLoginPage();
	}

	@And("^Click on the Login button$")
	public void click_login_button() {
		lp.clickLoginButton();
	}
	
	@Then("^Home page title captured$")
	public void page_title() {
		hp.gettitleOfTheHomePage();
	}

	@And("^Click on the logout$")
	public void logout() {
		hp.logout();
	}
}
