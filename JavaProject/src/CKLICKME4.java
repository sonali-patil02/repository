import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CKLICKME4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.id("promtButton")).click();
Thread.sleep(1000);
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
Thread.sleep(1000);
a.sendKeys("sonali");
a.accept();
Thread.sleep(1000);
WebElement a1=driver.findElement(By.id("promptResult"));
System.out.println(a1.getText());
	}
}
