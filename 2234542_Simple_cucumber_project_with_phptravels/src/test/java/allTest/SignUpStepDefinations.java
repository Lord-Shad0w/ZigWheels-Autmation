package allTest;

import java.util.List;

import baseClass.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpStepDefinations extends BaseClass{
	public static HomePage hp = new HomePage();
	public static LoginPage lp = new LoginPage();
	public static SignUpPage sp = new SignUpPage();
	@Given("User is on homepage")
	public void user_is_on_homepage() 
	{
	  hp.verifyHomePage();  
	}
	@When("User clicks Account and select CustomerSignup")
	public void user_clicks_account_and_select_customer_signup() throws InterruptedException 
	{
	   hp.clickAccount();
	   hp.selectSignUpType();
	}
	@When("User fills the form using valid data")
	public void user_fills_the_form_using_valid_data(DataTable dataTable) {
		sp.verifySignUpPage();
	    List<List<String>> data = dataTable.asLists();
	    sp.enterFirstName(data.get(1).get(1));
	    sp.enterLastName(data.get(2).get(1));
	    sp.enterPhone(data.get(3).get(1));
	    sp.enterEmail(data.get(4).get(1));
	    sp.enterPassword(data.get(5).get(1));
	}
	@When("User clicks Submit button")
	public void user_clicks_submit_button() {
	   sp.clickSignupButton();
	}
	@Then("User is redirected to LoginPage")
	public void user_is_redirected_to_login_page() {
	    lp.verifyPage();
	    lp.getSuccessMessage();
	}
}
