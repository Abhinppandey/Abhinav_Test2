package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Main.Setup;

public class FindLinksFromPage extends Setup {
	@Test
	public static void Tc1() {

		driver.get("https://www.wikipedia.org");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are:" + list.size());
		System.out.println("-------Printing all links-----------");
		for (WebElement webElement : list) {
			System.out.println(webElement.getAttribute("href"));
		}

		WebElement block = driver.findElement(By.xpath("//div[@class='other-projects']"));
		List<WebElement> list1 = block.findElements(By.tagName("a"));
		System.out.println("Total number of links are:" + list1.size());
		System.out.println("----Printing links of block-----");
		for (WebElement webElement : list1) {
			System.out.println(webElement.getAttribute("href"));
		}

	}

}
