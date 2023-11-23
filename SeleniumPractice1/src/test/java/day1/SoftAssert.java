package day1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public static void Tc1() {
		
		SoftAssert softAssert=new SoftAssert();
		String actualTitle = "Google.com";
		String expectedTitle = "Gmail.com";
//		assert.assertEquals(actualTitle, expectedTitle);

//		softAssert.assertEquals(actualTitle, expectedTitle);
		
	}

}
