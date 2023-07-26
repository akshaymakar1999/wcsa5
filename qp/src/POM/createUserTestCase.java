package POM;

import java.io.IOException;

public class createUserTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		 usersPage up = new usersPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		hp.clickOnuserModule();
       up.createManager(flib.raedExelData(EXCEL_PATH, "managercreds", 1, 0),flib.raedExelData(EXCEL_PATH, "managercreds", 1, 1),flib.raedExelData(EXCEL_PATH, "managercreds", 1, 2),flib.raedExelData(EXCEL_PATH, "managercreds", 1, 3));
		
		
		
		
		
		
	}
}
