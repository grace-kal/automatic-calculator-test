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

@ExtendWith(SeleniumExtension.class)

public class AutomationCalculatorTest {
	
	@Test
	public void success_FromMiToKmTest(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(1000);
	    
	    
	    driver.findElement(By.id("suma")).sendKeys("1");
	    sleep(1000);
	    assertEquals("1", driver.findElement(By.id("suma")).getAttribute("value"));
	    
	    Select measure= new Select( driver.findElement(By.id("ot")));
	    measure.selectByVisibleText("Миля (mi)");
	    sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@value='Пресметни']")).click();;
	    sleep(1000);
	    
	    var result=driver.findElement(By.id("result")).getText();
	    sleep(1000);
	    
	    assertEquals("1 Миля (mi) = 1.61 km", result);
	    sleep(1000);
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromMiToKmTest_Zero(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
//	    ---When in the input field a user puts 0 or doesn't put anything and presses 
//	    the button 'Пресметни' an alert message is shown.
//	    ---In the case shown bellow the user inputs 0.
	    
	    driver.findElement(By.id("suma")).sendKeys("0");
	    sleep(1000);
	    assertEquals("0", driver.findElement(By.id("suma")).getAttribute("value"));
	    
	    Select measure= new Select( driver.findElement(By.id("ot")));
	    measure.selectByVisibleText("Миля (mi)");
	    sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@value='Пресметни']")).click();;
	    sleep(1000);
	    
	    String alertMessage= driver.switchTo().alert().getText();
	    assertEquals("Моля, въведете стойност за преобразуване!", alertMessage);
	    sleep(1000);
	    
	    driver.switchTo().alert().accept();
	    sleep(1000);
	
	    String resultDisplay=driver.findElement(By.id("result")).getCssValue("display");
	    assertEquals("none", resultDisplay);
	    sleep(1000);
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromMiToKmTest_Null(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
//	    ---When in the input field a user puts 0 or doesn't put anything and presses 
//	    the button 'Пресметни' an alert message is shown.
//	    ---In the case shown bellow the user doesn't input anything.
	    
	    Select measure= new Select( driver.findElement(By.id("ot")));
	    measure.selectByVisibleText("Миля (mi)");
	    sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@value='Пресметни']")).click();;
	    sleep(1000);
	    
	    String alertMessage= driver.switchTo().alert().getText();
	    assertEquals("Моля, въведете стойност за преобразуване!", alertMessage);
	    sleep(1000);
	    
	    driver.switchTo().alert().accept();
	    sleep(1000);
	
	    String resultDisplay=driver.findElement(By.id("result")).getCssValue("display");
	    assertEquals("none", resultDisplay);
	    sleep(1000);
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void success_FromKmToMiTest(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
	    
	    driver.findElement(By.id("suma")).sendKeys("1");
	    sleep(1000);
	    assertEquals("1", driver.findElement(By.id("suma")).getAttribute("value"));
	    Select measure= new Select( driver.findElement(By.id("kam")));
	    measure.selectByVisibleText("Миля (mi)");
	    sleep(1000);
	    driver.findElement(By.xpath("//input[@value='Пресметни']")).click();;
	    sleep(1000);
	    var result=driver.findElement(By.id("result")).getText();
	    sleep(1000);
	    assertEquals("1 Километър (km) = 0.62 Миля (mi)", result);
	    sleep(1000);
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromKmToMiTest_Zero(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
	    
	    driver.findElement(By.id("suma")).sendKeys("0");
	    sleep(1000);
	    assertEquals("0", driver.findElement(By.id("suma")).getAttribute("value"));
	    
	    Select measure= new Select( driver.findElement(By.id("kam")));
	    measure.selectByVisibleText("Миля (mi)");
	    sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@value='Пресметни']")).click();;
	    sleep(1000);
	    
	    String alertMessage= driver.switchTo().alert().getText();
	    assertEquals("Моля, въведете стойност за преобразуване!", alertMessage);
	    sleep(1000);
	    
	    driver.switchTo().alert().accept();
	    sleep(1000);
	
	    String resultDisplay=driver.findElement(By.id("result")).getCssValue("display");
	    assertEquals("none", resultDisplay);
	    sleep(1000);
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromKmToMiTest_Null(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
	   
	    Select measure= new Select( driver.findElement(By.id("kam")));
	    measure.selectByVisibleText("Миля (mi)");
	    sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@value='Пресметни']")).click();;
	    sleep(1000);
	    
	    String alertMessage= driver.switchTo().alert().getText();
	    assertEquals("Моля, въведете стойност за преобразуване!", alertMessage);
	    sleep(1000);
	    
	    driver.switchTo().alert().accept();
	    sleep(1000);
	
	    String resultDisplay=driver.findElement(By.id("result")).getCssValue("display");
	    assertEquals("none", resultDisplay);
	    sleep(1000);
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void success_FromMiToMiTest(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
	    
	    
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromMiToMiTest(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
	    
	    
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void success_FromKmToKmTest(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
	    
	    
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
	@Test
	public void failure_FromKmToKmTest(ChromeDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		sleep(2000); 
	    driver.navigate().to("https://www.calculator.bg/1/merki_daljina.html");
	    sleep(2000);
	    
	    
	    
	    
	    
	    System.out.println(driver.getCurrentUrl());
	    sleep(2000);
	}
}
