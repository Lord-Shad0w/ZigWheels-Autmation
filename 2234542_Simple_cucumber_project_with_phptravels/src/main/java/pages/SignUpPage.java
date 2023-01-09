package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClass.BaseClass;

public class SignUpPage extends BaseClass	{
	
	@FindBy(name = "first_name")
	WebElement firstName;
	@FindBy(name = "last_name")
	WebElement lastName;
	@FindBy(name = "phone")
	WebElement phoneNumber;
	@FindBy(name = "email")
	WebElement Email;
	@FindBy(name = "password")
	WebElement passwordTextBox;
	@FindBy(id = "button")
	WebElement signupButton;
	public SignUpPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public void verifySignUpPage()
	{
		check = driver.getTitle();
		assertEquals(check, "Signup - PHPTRAVELS");
	}
	public void enterFirstName(String fname)
	{
		assertTrue(firstName.isEnabled());
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		assertTrue(lastName.isEnabled());
		lastName.sendKeys(lname);
	}
	
	public void enterPhone(String phone)
	{
		assertTrue(phoneNumber.isEnabled());
		phoneNumber.sendKeys(phone);
	}
	
	public void enterEmail(String email)
	{
		assertTrue(Email.isEnabled());
		Email.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		assertTrue(passwordTextBox.isEnabled());
		passwordTextBox.sendKeys(password);
	}
	
	public void clickSignupButton()
	{
		assertTrue(signupButton.isDisplayed());
		eWait.until(ExpectedConditions.elementToBeClickable(signupButton));
		signupButton.click();
	}
}
