import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement close =driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
close.click();
	}

}
