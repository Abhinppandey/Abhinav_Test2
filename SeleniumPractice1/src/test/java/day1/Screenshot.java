package day1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Main.Setup;

public class Screenshot extends Setup {

	@Test
	public void Tc1() throws Exception {
//		Date d = new Date();
//		String Filename = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
//		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Screenshot, new File("./Screenshot/" + Filename));
		
		Date d=new Date();
		String FileName=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("./Screenshot"+FileName));

	}

}
