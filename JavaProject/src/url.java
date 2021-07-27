import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.naukri.com/");
Thread.sleep(2000);
String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.quit();
	}

}
//This change has been done in github.
