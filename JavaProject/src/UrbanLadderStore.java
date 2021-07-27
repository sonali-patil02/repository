import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderStore {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.urbanladder.com/");
driver.manage().window().maximize();
//Thread.sleep(10000);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement close=driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]"));
close.click();
WebElement Stores=driver.findElement(By.xpath("//a[contains(.,' Stores ')]"));
Stores.click();
WebElement Pune=driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]"));
Pune.click();
	}

}
