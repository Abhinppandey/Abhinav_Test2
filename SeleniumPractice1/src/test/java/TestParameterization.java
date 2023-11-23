

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@DataProvider(name="dp")
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="trainer@W2A";
		data[0][1]="pass1";
		
		data[1][0]="java@W21";
		data[1][1]="pass2";
		
		data[2][0]="Selenium@W2A";
		data[2][1]="pass3";
		
		return data;
		
		
	}
	
	

	@Test(dataProvider = "dp")
	public void doLogin(String username, String password) {
		System.out.println(username+"----"+password);

	}

}
