
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class multisel {

// public WebDriver driver=null;
// public multisel (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public multisel (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	








@FindBy(id="multi-select")public WebElement newd;
//pomStart
	


}
