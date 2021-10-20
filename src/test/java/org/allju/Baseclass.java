package org.allju;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static  WebDriver browser(String browsername) {
	switch (browsername) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			default:
				System.err.println("Invalied");
		break;
		
	}
	return driver;
		}
	public static void url(String url) {
		driver.get(url);
		}
	public static void fillthetextbox(WebElement e,String value) {
		e.sendKeys(value);
				}
	public static void btnclick(WebElement e) {
		e.click();
		}
	public static String currenturl() {
		String url = driver.getCurrentUrl();
		return url;
		}
	public static String getatt(WebElement e) {
		return e.getAttribute("value");
		
		

	}
	
}