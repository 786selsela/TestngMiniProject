package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {
	public List<WebElement> getWebElements(String indetifierType, String identifierValue) {
		switch (indetifierType) {
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));

		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));

		case "ID":
			return BaseTest.driver.findElements(By.id(identifierValue));

		case "Name":
			return BaseTest.driver.findElements(By.name(identifierValue));
		case "LinkText":
			return BaseTest.driver.findElements(By.linkText(identifierValue));
		case "PartialLinkText":
			return BaseTest.driver.findElements(By.partialLinkText(identifierValue));
		case "TagName":
			return BaseTest.driver.findElements(By.tagName(identifierValue));
		default:}
			return null;

		}
		
		public WebElement getWebElement(String indetifierType,String identifierValue) {
			switch(indetifierType) {
			case"XPATH":
				return BaseTest.driver.findElement(By.xpath(identifierValue));
				
			case "CSS":
				return BaseTest.driver.findElement(By.cssSelector(identifierValue));
				
			case "ID":
				return BaseTest.driver.findElement(By.id(identifierValue));
				
				
			case "Name":
				return BaseTest.driver.findElement(By.name(identifierValue));
			case "LinkText":
				return BaseTest.driver.findElement(By.linkText(identifierValue));	
			case "PartialLinkText":
				return BaseTest.driver.findElement(By.partialLinkText(identifierValue));	
			case "TagName":
				return BaseTest.driver.findElement(By.tagName(identifierValue));	
				
				default:}
				
		return null;
	}

}
