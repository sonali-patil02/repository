import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDOWNfULL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
WebElement search=driver.findElement(By.name("q"));
search.sendKeys("java",Keys.ENTER);
Thread.sleep(2000);
JavascriptExecutor js= (JavascriptExecutor)(driver);
/*js.executeScript("window.scrollTo(0 ,document.body.scrollHeight)");
Thread.sleep(2000);
js.executeScript("window.scrollTo(0 ,-document.body.scrollHeight)");*/
WebElement ele=driver.findElement(By.xpath("//h3[text()='Download Java for Linux']"));
js.executeScript("arguments [0]. ScollIntoview()",ele);
	}

}
