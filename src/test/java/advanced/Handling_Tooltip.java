package advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Tooltip {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sitelint.com/blog/create-custom-and-accessible-tooltip/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'#0070d1')]"));
		action.moveToElement(element).perform();
		
		WebElement tooltip = driver.findElement(By.id("sllogo_title"));
		String tooltipText = tooltip.getText();
		
		System.out.println("Tooltip text : "+tooltipText);	
		driver.quit();
	}

}
