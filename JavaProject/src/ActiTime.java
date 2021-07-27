import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
WebElement username=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
WebElement pass=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
driver.findElement(By.id("username")).sendKeys(username.getText());
driver.findElement(By.name("pwd")).sendKeys(pass.getText(),Keys.ENTER);



	}

}
