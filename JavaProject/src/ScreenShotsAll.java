import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotsAll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		WebElement close =driver.findElement(By.xpath("class=\"close-reveal-modal hide-mobile\""));
		driver.close();
		Actions a=new Actions(driver);
		List<	WebElement> Menues=driver.findElements(By.xpath("//div[@id=\"topnav_wrapper\"]"));
		for(WebElement menuName:Menues)
		{
			String name=menuName.getText();
			System.err.println(name);
			Thread.sleep(2000);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
DemoScreenshot.takePic(driver,name);
List<WebElement> subMenues=driver.findElements(By.xpath(""))
		}	
			

}
	
}
