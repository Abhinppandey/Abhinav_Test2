package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Main.Setup;

public class Resizeable extends Setup {
	@Test
	public void Tc1() {
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 200, 0).perform();
	}

}
