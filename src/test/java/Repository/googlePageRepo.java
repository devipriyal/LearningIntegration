package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class googlePageRepo {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id='APjFqb']")
	WebElement searchTextBox;
	
	public googlePageRepo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
