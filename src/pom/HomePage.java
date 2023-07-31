package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "(//a[text()='Do not sell or share my personal information '])[1]") private WebElement doNotSellorShareMyPIButton;
	@FindBy(xpath = "//span[text()='Log In / Sign Up']") private WebElement logInOrSignUpButton;
		
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilizing
	public void clickOnLogInORSignUpButton()
	{
		logInOrSignUpButton.click();
		
	}
	public boolean signUpButtonDisplayed()
	{
		boolean status = logInOrSignUpButton.isDisplayed();
		return status;
	}
	public boolean signUpButtonClickable()
	{
		boolean status = logInOrSignUpButton.isSelected();
		return status;
	}
	public void clickOnDoNotSellorShareMyPIButton()
	{
		doNotSellorShareMyPIButton.click();
	}
	
}
