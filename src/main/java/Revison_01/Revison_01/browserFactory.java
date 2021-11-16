package Revison_01.Revison_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserFactory {
	static WebDriver driver;
	
	public static  WebDriver startBrowser() {
		
		 WebDriverManager.chromedriver().setup();
			
		 return driver=new ChromeDriver();
		
		
	};
	

}
