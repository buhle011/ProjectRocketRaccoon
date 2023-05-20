package pageObjects;

import org.openqa.selenium.By;

public class RR_PageObjects {
	
	public static final By Homepage_title = By.xpath("//div[contains(text(),'Project Rocket Raccoon (#GaurdiansOfTheGalaxy)')]");
	public static final By delete_button = By.xpath("(//a[contains(text(),'delete')])[1]");
	public static final By yes_button = By.xpath("//button[contains(text(),'Yes')]");
	public static final By add_button = By.xpath("//a[contains(text(),'Add')]");
	public static final By title_textfield = By.xpath("//div/input[@type='text']");
	public static final By Descr_textAr= By.xpath("//div/textarea[@name='description']");
	public static final By submit_button = By.xpath("//input[@type='submit']");
	

}
