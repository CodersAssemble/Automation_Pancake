package advanced;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenshots {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Interface-TakesScreenshot, getScreenshotAs-method
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //Using the file object to copy the image at desired location.
		 try {
			 FileUtils.copyFile(screenshotFile, new File("F://CodeBlooded/automationPanCake/screenshots/ss.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 Thread.sleep(3000);
		 driver.quit();

	}

}
