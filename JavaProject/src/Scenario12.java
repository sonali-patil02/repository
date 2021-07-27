import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario12 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
Actions a=new Actions(driver);
WebElement offer=driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']/span[@class='prcs-d']"));
a.moveToElement(offer).build().perform();
Thread.sleep(1000);
WebElement Twenty=driver.findElement(By.xpath("//span[contains(.,'Flat 20% off on Diamond Prices')]"));
a.moveToElement(Twenty).build().perform();
Twenty.click();

	}

}
