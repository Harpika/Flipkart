package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//intialization
public class POM 
{
@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
private WebElement un;
@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
private WebElement pwd;
@FindBy(xpath="//span[text()='Forgot?']")
private WebElement fgot;
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
private WebElement lgn;
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")
private WebElement otp;
@FindBy(xpath="//a[text()='New to Flipkart? Create an account']")
private WebElement ncreate;
@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement close; 

//Initialization
POM(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}

//Utilization
public void username()
{
	un.sendKeys("34578532");
	
}
public void password()
{
	pwd.sendKeys("456678964");
}
public void forgetPassword()
{
	fgot.click();
}
public void login()
{
	lgn.click();
}
public void ReqOtp()
{
	otp.click();
}	
public void createAcc()
{
	ncreate.click();
}
public void Close()
{
	close.click();
}


	
	


}
