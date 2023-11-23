package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class Parameterization {

	public static WebDriver driver;

//	@BeforeTest
//	public static void OpenBrowser() {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();

//	}

	@BeforeMethod
	public  void navigate() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
	}
//	@AfterTest
//	public static void teardown() {
//		driver.quit();
//	}

	@Test(dataProvider = "dp")
	public  void Login(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		System.out.println(username + "-----" + password);

	}

	@DataProvider(name = "dp")
	public Object[][] getData() {

		ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
		String SheetName = "LoginTest";

		int rowNum = excel.getRowCount(SheetName);
		int colNum = excel.getRowCount(SheetName);

		System.out.println("Total rows are:" + rowNum);
		System.out.println("Total cols are:" + colNum);

		Object[][] data = new Object[rowNum - 1][colNum];

		for (int rows = 2; rows <= rowNum; rows++) {
			for (int cols = 0; cols < colNum; cols++) {
				data[rows - 2][cols] = excel.getCellData(SheetName, cols, rows);
			}
		}

		return data;

	}

}
