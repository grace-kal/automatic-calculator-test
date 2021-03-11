package length.calculator.test.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage{
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public ConvectorsPage navigateToConvectorsPage() {
		
		driver.navigate().to(BASE_URL+"2/konvertor.html");
		return new ConvectorsPage(driver);
	}
	

}