package com.RanfordBank.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreeShot {
	
	public static void TakeScreenShot(WebDriver driver) {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	try {
		FileHandler.copy(src, new File("./ScreenShots/Login.png"));
		
	}catch(Exception e) {
		System.out.println("Not able to take screen shot");
	}	
		
	
	}
}
