package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Main.Setup;

public class FindListOfElementsFromDropdown extends Setup {

	@Test
	public void dropdown() {
		driver.get("https://www.wikipedia.org");
		new Select(driver.findElement(By.id("searchLanguage"))).selectByVisibleText("Polski");
		List<WebElement> list = driver.findElements(By.id("searchLanguage"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());

		}
	}

}
