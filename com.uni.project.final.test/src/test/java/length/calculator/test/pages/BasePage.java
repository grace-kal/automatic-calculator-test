package length.calculator.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	private WebDriver webDriver;
	
	public static final String BASE_URL="https://www.calculator.bg/";
	
	public BasePage(WebDriver driver) {
		webDriver=driver;
		PageFactory.initElements(driver, this);
	}

}

