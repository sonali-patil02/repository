import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement coin=driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
Actions a=new Actions(driver);
a.moveToElement(coin).build().perform();
coin.click();
Thread.sleep(1000);
WebElement two=driver.findElement(By.xpath("//div[@class='filter 2gms']"));
a.moveToElement(two).build().perform();
two.click();
Thread.sleep(1000);
driver.quit();
	}

}
