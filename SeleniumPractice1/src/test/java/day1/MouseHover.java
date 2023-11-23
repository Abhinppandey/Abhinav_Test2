package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Main.Setup;

public class MouseHover extends Setup {
	@Test
	public void TC1() {
		driver.get("https://www.carwale.com");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='NEW CARS']"))).perform();
	}

}
