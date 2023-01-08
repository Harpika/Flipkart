package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.ca/");
	 
	 //FindElement-Returns single Element
	 //Scenario 1-we will inspect 1 serach box webelement
	 /*WebElement searchbox =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 searchbox.sendKeys("Iphone Mobile");
	 WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	 search.click();
	 
	 //FindElemnet Scenario-2 when u want to find multiple elements at once ex-amazon page last info like contact us etc
	 WebElement MulElement=driver.findElement(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//a"));
	 System.out.println(MulElement.getText());
	 
	 //FindElement Scenario-3 when given wrong xpath then No such exception will return
	 WebElement Exeception=driver.findElement(By.xpath("//div[@class='navFooterVerticalColumn na']"));*/
	 
	 //FindElemnts-Returns Multiple Webelements using Iteration
	 List<WebElement> lower=driver.findElements(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//a"));
	 System.out.println(lower.size());//Returns number of Webelemnts
	 for(WebElement ele:lower)
	 {
	 System.out.println(ele.getText());
	 }
	}

}
