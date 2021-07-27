import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario14 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//ul/li[@id='goldCoins']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='filter 1gms']")).click();
driver.quit();
	}

}
