package io.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath ="//*[@id=\"txtUsername\"]")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	WebElement login;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName() {
		username.sendKeys(prop.getProperty("username"));
	}
	
	public void enterPassword() {
		password.sendKeys(prop.getProperty("password"));	
	}
	
	public void clickOnLogin() {
		login.click();
	}

}
