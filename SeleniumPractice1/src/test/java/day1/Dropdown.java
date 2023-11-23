package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Main.Setup;

public class Dropdown extends Setup {
	@Test
	public void dropdown() {
		driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		new Select(driver.findElement(By.name("selectionField"))).selectByValue("CN");
	}

}
