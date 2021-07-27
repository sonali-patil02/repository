import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgnmnt3 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
WebElement ring=driver.findElement(By.xpath(""));

	}

}
