package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.walmart.ca");
		Thread.sleep(6000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Screenshots\\Walmart.jpeg");
		FileUtils.copyFile(scr, dst);
		driver.quit();
		

	}

}
