import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gogglesearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement( By.name("q")).sendKeys("SELENIUM",Keys.ENTER);
List<WebElement> links=driver .findElements(By.tagName("a"));
for(WebElement link:links)
{
	System.out.println(link.getText());
}
	System.out.println(links.size());

	}

}
