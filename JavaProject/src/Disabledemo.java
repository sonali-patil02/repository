import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Disabledemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/selenium%20html/Disable.html");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait ww=new WebDriverWait(driver,10);
ww.until(new ExpectedCondition<Boolean>(){
	@ Override
	public Boolean apply(WebDriver driver) {
	return driver.findElement(By.id("xyz")).isEnabled();
		}
	});
driver.findElement(By.id("xyz")).sendKeys("Ankur");
}
}
