package advanced;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaxOfAllValuesInColDynamicTables {

	public static void main(String[] args) throws ParseException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		String max;
		double m=0,r=0;
		
		List<WebElement> colCount = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are : "+colCount.size());
		
		List<WebElement> rowCount = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " +rowCount.size());
		
		for (int i =1;i<rowCount.size();i++)
        {    
            max= driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
            NumberFormat f =NumberFormat.getNumberInstance(); 
            Number num = f.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);
            if(m>r)
             {    
                r=m;
             }
        }
		System.out.println("Maximum Currency Price : "+r);
	}
}
