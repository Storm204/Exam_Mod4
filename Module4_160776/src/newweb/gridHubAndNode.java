package newweb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridHubAndNode 
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		
		//capabilities.setCapability("firefox_binary", "C:/Users/npadmawa.CORP/AppData/Local/MozillaFirefox/firefox.exe");
		capabilities.setPlatform(Platform.ANY);
		//new URL("IPAddress of your registered node")
		WebDriver driver = new RemoteWebDriver(new URL("http://10.220.56.41:4444/wd/hub"), capabilities);
		
		try
		{
			//driver.get("URL of a project you want to execute")
			driver.get("http://ndafile:8081/OnlineBankingProjectSpring/");
			System.out.println(driver.getTitle());
			//driver.quit();
		}
		
		catch(Exception e)
		{
			System.out.println("Hello!");
		}
		
	}

}
