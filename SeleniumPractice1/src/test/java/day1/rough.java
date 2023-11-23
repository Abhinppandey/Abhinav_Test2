package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rough {

	public static WebDriver driver;

	@BeforeTest
	public void OB() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void EnterURL() {
		driver.get("http://www.facebook.com");
	}
	@Test
	public void Tc1() {
		System.out.println("Tc1");
	}

}
