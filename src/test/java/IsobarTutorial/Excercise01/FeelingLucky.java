package IsobarTutorial.Excercise01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FeelingLucky {
	
	public static void main(String[] args){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	WebElement searchBox = driver.findElement(By.id("lst-ib"));
	searchBox.sendKeys("Eirol John Lacang");
	searchBox.sendKeys(Keys.ENTER);
	}
}
