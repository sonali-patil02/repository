import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMOQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
driver.findElement(By.id("alertButton")).click();
Thread.sleep(2000);
Alert a=driver.switchTo().alert();
Thread.sleep(2000);
System.out.println(a.getText());
a.accept();
driver.findElement(By.id("confirmButton")).click();
Thread.sleep(2000);
Alert a1=driver.switchTo().alert();
a1.dismiss();
driver.findElement(By.id("confirmResult")).click();
System.out.println( a1.getText());
	}

}
