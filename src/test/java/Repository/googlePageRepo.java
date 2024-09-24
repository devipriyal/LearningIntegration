package Repository;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;




public class googlePageRepo {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id='APjFqb']")
	WebElement searchTextBox;
	
	public googlePageRepo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchText() throws InterruptedException{
		Thread.sleep(1000);
		if(searchTextBox.isEnabled() && searchTextBox.isDisplayed()){
		searchTextBox.sendKeys("Amazon");;
		Actions act= new Actions(driver);
		act.keyDown(Keys.ENTER);
		act.keyUp(Keys.ENTER);
		}
	}

}
