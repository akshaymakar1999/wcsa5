package POM;

import java.io.IOException;


public class validLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		// to call the webelement of login page created the obj of loginpage class	
        LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		
	}

}
