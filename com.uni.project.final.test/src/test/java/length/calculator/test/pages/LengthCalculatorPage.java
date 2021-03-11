package length.calculator.test.pages;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LengthCalculatorPage extends ConvectorsPage {

	private WebDriver driver;
	
	@FindBy(id="suma")
	private WebElement suma;
	
	@FindBy(id="ot")
	private WebElement from;
	
	@FindBy(id="kam")
	private WebElement to;

	@FindBy(xpath="//input[@value='Пресметни']")
	private WebElement calculate;
	
	@FindBy(id="result")
	private WebElement result;
	
	
	public LengthCalculatorPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void  fillSuma(String sum) {
		suma.sendKeys(sum);
	}
	public void  setFromMeasure(String measureTextFrom) {
		Select measure= new Select(from);
	    measure.selectByVisibleText(measureTextFrom);
	}
	public void  setToMeasure(String measureTextTo) {
		Select measure= new Select(to);
	    measure.selectByVisibleText(measureTextTo);
	}
	public LengthCalculatorPage  clickCalculate() {
		calculate.click();
		return this;
	}
	public String checkInputSuma() {
		return this.suma.getAttribute("value");
	}
	public String getResult() {
		return result.getText();
	}
	public String getResultDisplayValue() {
		return result.getCssValue("display");
	}

	public void calculateResult(String inputSuma, String measureFrom, String measureTo) throws InterruptedException {
		fillSuma(inputSuma);
		sleep(500);
		setFromMeasure(measureFrom);
		sleep(500);
		setToMeasure(measureTo);
		sleep(500);
		clickCalculate();
		sleep(500);
	}
	
	public LengthCalculatorPage isOnLengthCalculatorPage() {
		driver.findElement(By.xpath("//p[@style='text-transform: uppercase;margin-bottom:10px;']"));
		return this;
	}

	
	
}
