package Revison_01.Revison_01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestRunner01 extends browserFactory {
	
	WebDriver driver=startBrowser();
	
	@Test
	public void ff() {
		
		
		driver.get("https://www.google.com/");
		
		
		
	};
	
	
	
	

}
