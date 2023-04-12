//open browser

package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

	static WebDriver driver;
	static String browser = "chrome";
	static String url = "https://techfios.com/billing/?ng=admin/";

	public static WebDriver init() {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}

//	public static void tearDown() {
//		driver.close();
//		driver.quit();
//	}

}
