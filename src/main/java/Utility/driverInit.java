package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;

public class driverInit {
	
	WebDriver driver;
	
	
	public WebDriver InitialiseDriver(String browser){
		browser=browser.toLowerCase();
		if(browser!=null){
			switch (browser) {
			case "chrome":
				initialiseChrome();
				break;
			case "firefox":
				//initialiseFirefox();
				break;
			}
		}
		return driver;
	}
	
	private WebDriver initialiseChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	private WebDriver initialiseFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;	
	}
	
	

}
