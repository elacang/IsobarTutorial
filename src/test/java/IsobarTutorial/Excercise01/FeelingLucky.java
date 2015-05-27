package IsobarTutorial.Excercise01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeelingLucky {
	
	public static void main(String[] args){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@name='btnI']")).click();;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logo']")));
	Assert.assertEquals("https://www.google.com/doodles", driver.getCurrentUrl());
	driver.quit();
	}
}
