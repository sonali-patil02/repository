import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
WebElement Monthlyplan=driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]"));
Monthlyplan.click();
WebElement Amount=driver.findElement(By.xpath("//input[@id='amount']"));
Amount.sendKeys("50000",Keys.ENTER);
WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
Email.sendKeys("Sonali@123gmail.com",Keys.ENTER);
System.out.println(Monthlyplan.getText());
	}

}
