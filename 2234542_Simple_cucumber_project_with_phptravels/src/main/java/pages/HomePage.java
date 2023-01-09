package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClass.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(id = "ACCOUNT")
	WebElement account;	
	@FindBy(linkText = "Customer Signup")
	WebElement custSignUp;
		public HomePage() 
		{
			PageFactory.initElements(driver, this);
		}
		public void verifyHomePage()
		{
			check = driver.getTitle();
			assertEquals(check, "PHPTRAVELS | Travel Technology Partner - PHPTRAVELS");
		}
		public void clickAccount() throws InterruptedException
		{
			eWait.until(ExpectedConditions.elementToBeClickable(account));
			account.click();
		}
		public void selectSignUpType()
		{
			custSignUp.click();
		}
}
