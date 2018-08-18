package frameworkapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageIn {
	
private static WebDriver driver = null;

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balaji\\Downloads\\geckodriver-v0.21.0-win32\\geckodriver.exe");

driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.amazon.com.au/");

// Use page Object library now

HomeIn.lnk_MyAccount(driver).click();

LogIn.txtbx_UserName(driver).sendKeys("1234567");

LogIn.txtbx_Password(driver).sendKeys("Test@123");

LogIn.btn_LogIn(driver).click();

//System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

HomeIn.lnk_LogOut(driver).click(); 

driver.quit();

}
}

