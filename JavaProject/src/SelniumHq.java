import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelniumHq {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.selenium.dev/");
	}

}
