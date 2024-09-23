package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Repository.googlePageRepo;
import Utility.driverInit;

public class testGoogleHomePage extends driverInit{
	WebDriver driver;
	googlePageRepo gpRepo= new googlePageRepo(driver);
	
	@BeforeClass
	public void getDriver(){
		driver=InitialiseDriver("chrome");
	}
	
	@AfterClass
	public void closeDriver(){
		driver.quit();
	}
	
	@Test
	public void goToGoogle() throws InterruptedException{
		driver.get("https://www.google.com");
		gpRepo.enterSearchText();
	}

}
