package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Main.Setup;

public class RightClick extends Setup {
	@Test
	public void Tc1() {
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		WebElement rightclick = driver.findElement(By.xpath("//div[@id='dm2m0']/following-sibling::p/img"));
		Actions action = new Actions(driver);
		action.contextClick(rightclick).perform();

	}

}
