package pixelImages;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ComparingImages {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		Screenshot logoScreenShot = new AShot().takeScreenshot(driver, logo);
		
		//Saving screenshot as a file format
		
		//to get the taken screenshot---logoScreenShot.getImage()
		
		ImageIO.write(logoScreenShot.getImage(),"png", new File("F://CodeBlooded/automationPanCake/logos/logo.png"));
		
//		File f = new File("F://CodeBlooded/automationPanCake/logos/logo.png");
		
//		if(f.exists()) {
//			System.out.println("Image File Captured!");
//		}else {
//			System.out.println("Image File Not existed!");
//		}
	}

}
