package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pom.HomePage;

public class ValidateSignUp extends Base {
    HomePage hm ;
	
   @BeforeClass
   public void openBuildaBear()
   {  
	   launchBuildAbear();
	   hm = new HomePage(driver);
   }
  @Test
  public void validateSignUp() {
	  hm.clickOnDoNotSellorShareMyPIButton();
	  hm.clickOnLogInORSignUpButton();
  }
  @Test(priority =-1)
  public void validateBuild_A_BearURL()
  {
	  String expectedURL="https://www.buildabear.com/";
	  String actualURL = driver.getCurrentUrl();
	  Assert.assertEquals(actualURL, expectedURL,"Actual and expected Build-A-Bear application URL does not matching");
	  Reporter.log("URL is matching", true);
  }
  @Test
  public void validateSignUpButtonIsDisplayed()
  { 
	  Assert.assertTrue(hm.signUpButtonDisplayed(),"SignUp button is not displayed");
	  Reporter.log("Log In/Sign Up button is displayed", true);
  }
  public void validateSignUpButtonIsClickable()
  {
	  Assert.assertTrue(hm.signUpButtonClickable(),"Log In/Sign Up button is clickable");
  }
  
}
