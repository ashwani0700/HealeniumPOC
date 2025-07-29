package testfmwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;import com.epam.healenium.SelfHealingDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest{
	private WebDriver delegate;
	public SelfHealingDriver driver;
		
	
	@Test
	public void TestLaunch() {
		System.out.print("here");
		WebDriverManager.chromedriver().setup();
		delegate =  new ChromeDriver();
		driver = SelfHealingDriver.create(delegate);
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		if(driver==null) {System.out.println(" Driver is null");}
		
		PageObject pg = new PageObject(driver);
	pg.enterCity("Delhi");
	pg.clickCheckWeatherButton();
	pg.getTempratureText();
	driver.quit();
	}
	


}
