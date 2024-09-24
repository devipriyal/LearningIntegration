package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Repository.googlePageRepo;
import Utility.driverInit;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

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
	public void checkWebtable() throws InterruptedException, IOException{
		driver.get("https://omayo.blogspot.com/");
		WebElement element = driver.findElement(By.xpath("//*[@id='table1']/tbody"));
		Screenshot shotEle= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);
		ImageIO.write(shotEle.getImage(), "PNG", new File(System.getProperty("user.dir")+"\\Screenshot\\"+"element1.PNG"));
		List<WebElement> rows= new ArrayList<WebElement>();
		List<WebElement> column= new ArrayList<WebElement>();
		rows=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
		int rowSize= rows.size();
		System.out.println("row Size :" +rowSize);

		for(int r=1; r <=rowSize; r++){
		column=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr[" +r+ "]/td"));
		int cnum=column.size();
		System.out.println("Column size:" +cnum);
			System.out.println("Name :"+driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[" +r+ "]/td[1]")).getText());
			System.out.println("Age :"+driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[" +r+ "]/td[2]")).getText());
			System.out.println("Place :"+driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[" +r+ "]/td[3]")).getText());
			
		
		}
	}

	//@Test
	public void arrayTest() {
		int arr[] = new int[3];
		arr[0]=1;
		
		int[] arr1= new int[2];
		arr1[0]=10;
		
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		
		
	}
}
