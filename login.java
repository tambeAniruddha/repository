package scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class login {
	
	static String driverPath = "D:\\SMS8.1-2019\\test\\resources\\drivers\\";
	static String mainWindowHandle = null;
	static String currentWindowHandle = null;
	static String previousWindowHandle = null;
	
	public static void main(String args[]) {
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("requireWindowFocus", true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		System.setProperty("webdriver.ie.driver", "D:\\SMS8.1-2019\\test\\resources\\drivers\\IEDriverServer2.4.exe");
		WebDriver driver = new InternetExplorerDriver(capabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		// Launch URL
				System.out.println("Launching URL");
				driver.get("http://10.69.11.99/smsqc/");

				mainWindowHandle = driver.getWindowHandle();
				currentWindowHandle = mainWindowHandle;
				previousWindowHandle = null;
				
				JavascriptExecutor js = (JavascriptExecutor) driver;

				// Switch to login window
				System.out.println("Switching window");

				Set<String> winHandles = driver.getWindowHandles();
				for (String e : winHandles) {
					if (!e.equals(mainWindowHandle) & !e.equals(currentWindowHandle)) {
						driver.switchTo().window(e);
						break;
					}
				}

				previousWindowHandle = currentWindowHandle;
				currentWindowHandle = driver.getWindowHandle();

				// Maximize the browser
				driver.manage().window().maximize();
				
				// Enter Login Id
				// js.executeScript("document.getElementById('txtLogin').value=''");
				js.executeScript("document.getElementById('txtLogin').value='restu'");
				System.out.println("Username entered");
	}
}
