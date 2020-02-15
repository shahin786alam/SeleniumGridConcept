package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchChromeTest {

	public static void main(String[] args) throws MalformedURLException {
	     //1. define DesireadCapabilitis cap:
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//2. Chrome options definitions:
		ChromeOptions option= new ChromeOptions();
		option.merge(cap);
		
		String huburl="http://192.168.13.1:45719/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(huburl),option);
		
		driver.get("http://www.facebook.com");
		System.out.println("Title is: "+ driver.getTitle());
		driver.quit();

	}

}
