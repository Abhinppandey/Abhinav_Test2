package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Main.Setup;

public class Frame extends Setup {

	@Test
	public void frame() {
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn"));
	}

}
