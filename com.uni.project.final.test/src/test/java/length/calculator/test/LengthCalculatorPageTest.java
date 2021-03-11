package length.calculator.test;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.seljup.SeleniumExtension;
import length.calculator.test.pages.HomePage;
import length.calculator.test.pages.LengthCalculatorPage;

@ExtendWith(SeleniumExtension.class)
public class LengthCalculatorPageTest {

	@Test
	public void success_FromMiToKmTest(ChromeDriver driver) throws InterruptedException {
		
		String inputSuma="1";
		String from="Миля (mi)";
		String to="Километър (km)";
		String expectedResult="1 Миля (mi) = 1.61 km";

		LengthCalculatorPage automateLengthCalculator =  new HomePage(driver).navigateToLengthCalculatorPage();
		sleep(1000);
		automateLengthCalculator.calculateResult(inputSuma, from, to);
		sleep(1000);
		String checkInput=automateLengthCalculator.checkInputSuma();
		assertEquals("1", checkInput);
		sleep(1000);

		String finalResult=automateLengthCalculator.getResult();
		assertEquals(expectedResult, finalResult);
	    sleep(1000);
		
		
		
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromMiToKmTest_Zero(ChromeDriver driver) throws InterruptedException {
//		---No input or zero input should have the same result
		String inputSuma="0";
		String from="Миля (mi)";
		String to="Километър (km)";
		String expectedAlertMessage="Моля, въведете стойност за преобразуване!";

		LengthCalculatorPage automateLengthCalculator =  new HomePage(driver).navigateToLengthCalculatorPage();
		sleep(1000);
		automateLengthCalculator.calculateResult(inputSuma, from, to);
		sleep(1000);
		

		String alertMessage= driver.switchTo().alert().getText();
	    assertEquals(expectedAlertMessage, alertMessage);
	    sleep(1000);
		driver.switchTo().alert().accept();
		sleep(1000);
		
		String resultDisplay=automateLengthCalculator.getResultDisplayValue();
	    assertEquals("none", resultDisplay);
	    sleep(1000);
		
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromMiToKmTest_Null(ChromeDriver driver) throws InterruptedException {
//		---No input or zero input should have the same result
		String inputSuma="";
		String from="Миля (mi)";
		String to="Километър (km)";
		String expectedAlertMessage="Моля, въведете стойност за преобразуване!";

		LengthCalculatorPage automateLengthCalculator =  new HomePage(driver).navigateToLengthCalculatorPage();
		sleep(1000);
		automateLengthCalculator.calculateResult(inputSuma, from, to);
		sleep(1000);
		

		String alertMessage= driver.switchTo().alert().getText();
	    assertEquals(expectedAlertMessage, alertMessage);
	    sleep(1000);
		driver.switchTo().alert().accept();
		sleep(1000);
		
		String resultDisplay=automateLengthCalculator.getResultDisplayValue();
	    assertEquals("none", resultDisplay);
	    sleep(1000);
		
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void success_FromKmToMiTest(ChromeDriver driver) throws InterruptedException {
		
		String inputSuma="1";
		String from="Километър (km)";
		String to="Миля (mi)";
		String expectedResult="1 Километър (km) = 0.62 Миля (mi)";

		LengthCalculatorPage automateLengthCalculator =  new HomePage(driver).navigateToLengthCalculatorPage();
		sleep(1000);
		automateLengthCalculator.calculateResult(inputSuma, from, to);
		sleep(1000);
		String checkInput=automateLengthCalculator.checkInputSuma();
		assertEquals("1", checkInput);
		sleep(1000);

		String finalResult=automateLengthCalculator.getResult();
		assertEquals(expectedResult, finalResult);
	    sleep(1000);
		
		
		
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromKmToMiTest_Zero(ChromeDriver driver) throws InterruptedException {
//		---No input or zero input should have the same result
		String inputSuma="0";
		String from="Километър (km)";
		String to="Миля (mi)";
		String expectedAlertMessage="Моля, въведете стойност за преобразуване!";

		LengthCalculatorPage automateLengthCalculator =  new HomePage(driver).navigateToLengthCalculatorPage();
		sleep(1000);
		automateLengthCalculator.calculateResult(inputSuma, from, to);
		sleep(1000);
		

		String alertMessage= driver.switchTo().alert().getText();
	    assertEquals(expectedAlertMessage, alertMessage);
	    sleep(1000);
		driver.switchTo().alert().accept();
		sleep(1000);
		
		String resultDisplay=automateLengthCalculator.getResultDisplayValue();
	    assertEquals("none", resultDisplay);
	    sleep(1000);
		
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromKmToMiTest_Null(ChromeDriver driver) throws InterruptedException {
//		---No input or zero input should have the same result
		String inputSuma="";
		String from="Километър (km)";
		String to="Миля (mi)";
		String expectedAlertMessage="Моля, въведете стойност за преобразуване!";

		LengthCalculatorPage automateLengthCalculator =  new HomePage(driver).navigateToLengthCalculatorPage();
		sleep(1000);
		automateLengthCalculator.calculateResult(inputSuma, from, to);
		sleep(1000);
		

		String alertMessage= driver.switchTo().alert().getText();
	    assertEquals(expectedAlertMessage, alertMessage);
	    sleep(1000);
		driver.switchTo().alert().accept();
		sleep(1000);
		
		String resultDisplay=automateLengthCalculator.getResultDisplayValue();
	    assertEquals("none", resultDisplay);
	    sleep(1000);
		
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	
	@Test
	public void failure_FromKmToMi_NegativeValue(ChromeDriver driver) throws InterruptedException {
//		---The input is negative number, but the input field will only allow the number to be
//		typed and will ignore the sign
		String inputSuma="-1";
		String from="Километър (km)";
		String to="Миля (mi)";
		String expectedResult="1 Километър (km) = 0.62 Миля (mi)";

		LengthCalculatorPage automateLengthCalculator =  new HomePage(driver).navigateToLengthCalculatorPage();
		sleep(1000);
		automateLengthCalculator.calculateResult(inputSuma, from, to);
		sleep(1000);
		String checkInput=automateLengthCalculator.checkInputSuma();
		assertEquals("1", checkInput);
		sleep(1000);

		String finalResult=automateLengthCalculator.getResult();
		assertEquals(expectedResult, finalResult);
	    sleep(1000);
		
		
		
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	
}
