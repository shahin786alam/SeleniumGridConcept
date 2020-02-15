package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SDETGridConcept {
	
	public static void main(String[] args) throws MalformedURLException {
		String nodeurl="http://192.168.13.1:45719/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files"
				+ "\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new RemoteWebDriver(new URL(nodeurl),cap);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Url is: "+driver.getCurrentUrl());
		driver.quit();
	}

}
