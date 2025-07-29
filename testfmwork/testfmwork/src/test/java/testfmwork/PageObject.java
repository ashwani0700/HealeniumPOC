package testfmwork;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import com.epam.healenium.SelfHealingDriver;



public class PageObject {
	
	private SelfHealingDriver driver;
    private By cityInputLocator = By.xpath("//input[@id='city-input']");
    private By checkWeatherButtonLocator = By.xpath("//*[@title='Check Weather']");
    private By tempratureCardLocator = By.xpath("//span[text()='Temprature:']/following-sibling::span");
	
    public PageObject(SelfHealingDriver driver) {
		this.driver = driver;
		
	}


public void enterCity(String city){
	WebElement cityInput = driver.findElement(cityInputLocator);
	try {
		Thread.sleep(2000);
		cityInput.sendKeys(city);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

public void clickCheckWeatherButton(){
	WebElement checkWeatherbutton = driver.findElement(checkWeatherButtonLocator);
	checkWeatherbutton.click();
}
public void getTempratureText() {
	
	try {
		Thread.sleep(5000);
		
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	WebElement tempratureCard = driver.findElement(tempratureCardLocator);
	System.out.println(tempratureCard.getText());
}


	

}
