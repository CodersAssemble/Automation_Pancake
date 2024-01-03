package svgImages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSVGImages {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("file:///C:/Users/yases/Desktop/index.html");
		/*
				<!DOCTYPE html>
				<html lang="en">
				<head>
				  <meta charset="utf-8">
				  <meta name="description" content="Hello World app for Fifa Social">
				  <meta name="viewport" content="width=device-width">
				  <title>Fifa Social - Hello World</title>
				
				
				</head>
				<body>
				   <svg>
						<circle cx="50" cy="50" r="50" fill="red" />
				   </svg>
				   <svg>
				        <text id="yashu"
						x="5" y="30">Yaseswini Yarlagadda</text>
				   </svg>   
				   <svg>
						<rect x="0" y="0" width="100" height="100" fill="green" />
				   </svg>
				   <svg>
						<line x1="0" y1="0" x2="100" y2="100" stroke="#529fca" />
				   </svg>
				   <svg height="300" width="300">
						<path
							d="M 100 100 L 200 200 H 10 V 40 H 70"
							fill="#59fa81"
							stroke="#d85b49"
							stroke-width="3"
						/>
					</svg>
					<svg>
						<polygon points="9.9, 1.1, 3.3, 21.78, 19.8, 8.58, 0, 8.58, 16.5, 21.78" />
					</svg>
					<svg width="200" height="200">
					  <rect x="0" y="0" width="100" height="100" fill="#529fca" />
					  <g id="my-group">
						<rect x="0" y="100" width="100" height="100" fill="#59fa81" />
						<rect x="100" y="0" width="100" height="100" fill="#ad4a3d" />
					  </g>
					</svg>
					<svg>
					<text id="yas" x="5" y="70" style="fill: green; font
					: Courier New">Yashu</text>
					</svg>
				</body>
				</html>
		*/
		String color = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("fill");
		System.out.println(color);
		
		String text = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @id='yas']")).getText();
		System.out.println(text);
	}

}
