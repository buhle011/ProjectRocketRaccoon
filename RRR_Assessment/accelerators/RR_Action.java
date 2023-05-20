package accelerators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RR_Action extends RR_Base{
	
	
	// Function to get text
	public static String getElementText(By object, String elementName) {
		String sText = "";
		try {
			if (driver.findElement(object).isDisplayed()) {
				sText = driver.findElement(object).getText();
				
			} else {
				System.out.println("Failed to get text ");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sText;
	}
	//wait for element to be visible
	public static boolean waitForElement(By Locator, long lTime){
		
		try{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.elementToBeClickable (Locator));
			Thread.sleep(2000);
			return true;
			
		}
		catch(Exception e){
			System.out.println("Failed to wait for element to be visible");
			 
			return false;
		}
	}
	
	//Function to click on an element
			public static boolean clickOnElement(By object,String elementName) {
				boolean bFlag=false;
				try {
					if(driver.findElement(object).isDisplayed()) {
						driver.findElement(object).click();
						System.out.println("Clicked on "+elementName);
						bFlag= true;
					}
					else {
						System.out.println("Failed to click on "+elementName);
					}
				}
				catch (Exception e) {
					System.out.println("Failed to click on "+elementName);
					
				}
				return bFlag;
			}
		

		//Function to type in text box 
		public static void typeInTextBox(By object,String data,String elementName) {
			try {
					driver.findElement(object).clear();
					driver.findElement(object).sendKeys(data);
					
				}
				catch (Exception e) {
				
			   }
			}
		

}
