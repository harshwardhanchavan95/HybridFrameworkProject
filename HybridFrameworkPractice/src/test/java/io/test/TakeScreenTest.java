package io.test;

import org.testng.annotations.Test;

import io.base.BaseClass;
import io.utils.ScreenShot;

public class TakeScreenTest extends BaseClass{
	@Test
	public void scren() {
		ScreenShot screenShot=new ScreenShot();
		initialize();
		screenShot.takesScreenShot();
		
	}
	
	

}
