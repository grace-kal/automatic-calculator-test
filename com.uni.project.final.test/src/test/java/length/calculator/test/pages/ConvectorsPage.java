package length.calculator.test.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ConvectorsPage extends HomePage{

private WebDriver driver;
	
	public ConvectorsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public LengthCalculatorPage navigateToLengthCalculator() {
		driver.navigate().to(BASE_URL+"1/merki_daljina.html");
		driver.manage().window().maximize();
		return new LengthCalculatorPage(driver);
	}
}
