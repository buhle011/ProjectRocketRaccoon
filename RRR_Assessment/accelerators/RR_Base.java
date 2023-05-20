package accelerators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RR_Base {
	
public static WebDriver driver = null;
	
	//Function to open the browser
	public static WebDriver OpenBrowser(){
		try {  
			
			 System.getProperty("D:/Projects/RocketRaccoon/ProjectRocketRaccoon/Drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://beta.warrenroman.com/project-rocket-raccoon/home");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 	    
	   } 
		catch (Exception e) {
			System.out.println("Failed to open the browser");
			
	}
		return driver;
		
	}
	
	//Function to close the browser
	public static WebDriver CloseBrowser() {
		
		try{
			driver.quit();
		   } 
			catch (Exception e) {
				
				System.out.println("Failed to close the browser");
		   }
			return driver;
			
		   }
		
	}


