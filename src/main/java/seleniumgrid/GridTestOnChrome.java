package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTestOnChrome {
	
	@Test
	public void test() throws MalformedURLException {
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://192.168.13.1:45719/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		
		driver.get("https://www.facebook.com");
		System.out.println("title is: "+ driver.getTitle());
		driver.quit();
	}

}
