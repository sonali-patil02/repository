import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Script10 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bluestone.com/");

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement chat=driver.findElement(By.xpath("//p[@class='lc-9blymn e16i86ec0']"));
WebDriverWait ww=new WebDriverWait(driver, 5);
ww.until(ExpectedConditions.alertIsPresent());
driver.getWindowHandles();
chat.click();
driver.findElement(By.id("confirmResult")).click();
WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
name.sendKeys("Sonali");
WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
email.sendKeys("sonali@gmail.com");
WebElement phone=driver.findElement(By.xpath("//input[@id='m3vwggyohue_146917605549304831']"));
phone.sendKeys("12345678901");
driver.findElement(By.className("lc-oilnk5 esv0owm2")).click();
Thread.sleep(10000);
driver.findElement(By.className("lc-jftu2g e1m92qam0")).sendKeys("Hello..Bluestone....");
driver.findElement(By.className("e5ibypu0 lc-f2es22")).click();
WebElement text=driver.findElement(By.className("'lc-1h0mrys eovu8nx0"));
System.out.println(text.getText()) ;
	}
}
