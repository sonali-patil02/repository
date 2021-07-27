import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(8000);
driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy (200,0)");
Thread.sleep(8000);
js.executeScript("window.scrollBy (-200,0)");


	}

}
