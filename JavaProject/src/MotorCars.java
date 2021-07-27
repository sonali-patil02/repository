import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MotorCars {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.rolls-roycemotorcars.com/");
driver.manage().window().maximize();
WebElement cancel=driver.findElement(By.xpath(""));

Actions a=new Actions(driver);
a.moveToElement(cancel).build().perform();
driver.findElement(By.xpath("//div[@class='rrmc-primary-nav-copy-container']")).click();
driver.findElement(By.xpath("//button[@class='rrmc-cta rrmc-menu-link js-menu-section-link']/span[contains(.,'Models')]")).click();
WebElement models=driver.findElement(By.xpath("//div[@class='rrmc-scroll-links']"));
models.click();
System.out.println(models.getText());
TakesScreenshot ts=(TakesScreenshot)driver;
File ss=ts.getScreenshotAs(OutputType.FILE);
File ssSave= new File("./Screenshot/Models Names.png");
Files .copy(ss,ssSave);


	}
	

}
