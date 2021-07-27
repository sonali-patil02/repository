import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		search.sendKeys("Java");
		Thread.sleep(2000);
		List<WebElement>sugg=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (WebElement sea:sugg)
		{
			System.out.println(sea.getText());
			}
		sugg.get(0).click();
			
	
List<	WebElement> dblclk=driver.findElements(By.xpath("//div[@class=\"SPZz6b\"]/h2[contains(.,'Java')]"));
Actions a=new Actions(driver);
for (WebElement menuname:dblclk)
{
a.doubleClick(menuname).perform();
	}

}
}