package io.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.base.BaseClass;
import io.page.LoginPage;
import io.utils.ExcelReader;

public class ExcelReaderTest extends BaseClass {
	
	@Test(priority = 1, dataProvider = "XYZ")
	public void excelData(String username, String password, String str) {
		System.out.println(username+"  "+password);	
	}
	
	@DataProvider(name = "XYZ")
	public Object readExcel() {
		ExcelReader excelReader=new ExcelReader();
		Object data=excelReader.readexcel(0);
		return data;
	}
	

}
