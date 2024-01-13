package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

	ElementFetch elementFetch = new ElementFetch();

	public void verifyIfLoginPageIsLoaded() {
		   Assert.assertTrue(elementFetch.getWebElements("XPATH", LoginPageElements.loginText).size()== 0,
	                "Element not found");

	}
	public void enterCredential() {
		
		elementFetch.getWebElement("XPATH",LoginPageElements.emailAddress).sendKeys("abc@gmail.com");
		elementFetch.getWebElement("XPATH",LoginPageElements.password).sendKeys("abcd");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
