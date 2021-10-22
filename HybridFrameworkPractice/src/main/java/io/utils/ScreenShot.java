package io.utils;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.base.BaseClass;

public class ScreenShot extends BaseClass {
	public void takesScreenShot() {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\Screenshot\\homepage.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}

}
