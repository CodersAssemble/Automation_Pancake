package svgImages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;


public class HandlingSVGImages {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("file:///C:/Users/yases/Desktop/index.html");
		
		String expectedColor = "red";
		String actualColor = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("fill");
		Assert.assertEquals(expectedColor, actualColor);
		System.out.println("Assertion Passed! expected color : " +expectedColor+ " and actual color : " +actualColor+ " are same!");
	
		String expectedText = "Yaseswini Yarlagadd";
		String actualText = driver.findElement(By.xpath("//*[name()=\"svg\"]//*[local-name()=\"text\" and @id=\"yashu\"]")).getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Assertion Passed! expected text : " +expectedText+ " and actual text : " +actualText+ " are same!");
		
		String expectedFill = "green";
		String actualFill = driver.findElement(By.xpath("//*[name()=\"svg\"]//*[local-name()=\"rect\"]")).getAttribute("fill");
		Assert.assertEquals(actualFill, expectedFill);
		System.out.println("Assertion Passed! expected fill : " +expectedFill+ " and actual fill : " +actualFill+ " are same!");
		
		String expectedStroke = "#529fca";
		String actualStroke = driver.findElement(By.xpath("//*[name()=\"svg\"]//*[local-name()=\"line\"]")).getAttribute("stroke");
		Assert.assertEquals(actualStroke, expectedStroke);
		System.out.println("Assertion Passed! expected stroke : " +expectedStroke+ " and actual stroke : " +actualStroke+ " are same!");
		
		String expectedTagText = "Yashu";
		String actualTagText = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @id='yas']")).getText();
		Assert.assertEquals(actualTagText, expectedTagText);
		System.out.println("Assertion Passed! expected tag text : " +expectedTagText+ " and actual tag text : " +actualTagText+ " are same!");
		
		String expectedX = "#59fa81";
		String expectedY = "#ad4a3d";
		String actualX = driver.findElements(By.xpath("//*[name()=\"svg\"]//*[local-name()=\"g\"]//*[local-name()=\"rect\"]")).get(0).getAttribute("fill");
		String actualY = driver.findElements(By.xpath("//*[name()=\"svg\"]//*[local-name()=\"g\"]//*[local-name()=\"rect\"]")).get(1).getAttribute("fill");
		Assert.assertEquals(actualY, expectedY);
		System.out.println("Assertion Passed! expected Y : " +expectedY+ " and actual Y : " +actualY+ " are same!");
		Assert.assertEquals(actualX, expectedX);
		System.out.println("Assertion Passed! expected X : " +expectedX+ " and actual X : " +actualX+ " are same!");
		
	}

}
