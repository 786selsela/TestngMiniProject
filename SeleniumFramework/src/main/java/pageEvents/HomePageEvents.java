package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	ElementFetch elementFetch=new ElementFetch();
	public void signInButton() {
		elementFetch.getWebElement("XPATH",HomePageElements.singInButtonText).click();
	}
	

}
