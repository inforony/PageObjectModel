package pageOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailLogingTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		loginpage lg = new loginpage(driver);
		lg.txtbox.sendKeys("inforony0");
		lg.clicklink.click();
	}

}
