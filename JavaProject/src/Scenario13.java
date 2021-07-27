
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement offer=driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']"));
Actions a=new Actions(driver);
a.moveToElement(offer).build().perform();
Thread.sleep(1000);
WebElement five=driver.findElement(By.xpath("//span[contains(.,'Flat 5% off on Solitaire Jewellery, Use Code - SPARK50')]"));
five.click();
Thread.sleep(1000);
driver.quit();
	}
}
