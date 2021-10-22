package io.test;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.base.BaseClass;
import io.page.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	
	
	@BeforeClass
	public void setUp() {
	    initialize();
	    loginPage=new LoginPage();
	}
	
	@Test
	public void validateLogin() {
		loginPage.enterUserName();
		loginPage.enterPassword();
		loginPage.clickOnLogin();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
