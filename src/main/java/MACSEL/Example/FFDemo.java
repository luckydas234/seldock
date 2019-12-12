package MACSEL.Example;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FFDemo 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	}
	@Test
	public static void testApp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.FIREFOX);
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.9:4545/wd/hub"),cap);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("LKY");
		Thread.sleep(5000);
		driver.quit();
	}

}
