package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class invalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setup();
		//preform invalid login
		//get into the login page 
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcreds");
		
		for (int i=1;i<=rc;i++)
		{
			lp.invalidLoginMethod(flib.raedExelData(EXCEL_PATH, "invalidcreds", i, 0),flib.raedExelData(EXCEL_PATH, "invalidcreds", i, 1));
		}

		
		
	}

}
