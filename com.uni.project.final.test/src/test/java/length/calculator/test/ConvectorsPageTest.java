package length.calculator.test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.seljup.SeleniumExtension;
import length.calculator.test.pages.HomePage;

@ExtendWith(SeleniumExtension.class)

public class ConvectorsPageTest {

	@Test
	public void convectorsPageOpenTest(ChromeDriver driver) throws InterruptedException {
		new HomePage(driver)
			.navigateToConvectorsPage();
	}

}
