package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
	ElementFetch elementFetch=new ElementFetch();
	HomePageEvents homePage=new HomePageEvents();
	LoginPageEvents loginPage=new LoginPageEvents();
	
	
	
	
  @Test
  public void sampleMethodForEnteringCredentials(){
	  homePage.signInButton();
	  loginPage.verifyIfLoginPageIsLoaded();
	  loginPage.enterCredential();
	  
	  
	  
	  
	  
	  
  
	  
	  
	  
	  
	  
	  
	  
  }
}
