
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class orenge {

// public WebDriver driver=null;
// public orenge (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public orenge (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	




@FindBy(id="btnLoginnn")public WebElement Submit8;

@FindBy(xpath="//input[@id='txtPassword']")public WebElement txtPassword15;

@FindBy(xpath="//input[@id='txtUsername']")public WebElement txtUsername21;





@FindBy(tagName="div")public List<WebElement> newlistttt;
//pomStart
	


}
