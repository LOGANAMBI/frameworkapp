package frameworkapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeIn {
	private static WebElement element = null;
	 
	 public static WebElement lnk_MyAccount(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement lnk_LogOut(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("account_logout"));
	 
	 return element;
	 
	    }
	 
}
