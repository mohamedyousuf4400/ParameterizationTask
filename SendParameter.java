package parameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class EnterTheValueTask {
	
	public WebDriver driver;
	
	@Test
	@Parameters("Name")
	public void ParaValue(String Name) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		WebElement GoogleSearch = driver.findElement(By.xpath("//input[@name='q']"));
		GoogleSearch.sendKeys(Name+Keys.ENTER);
	}
}
