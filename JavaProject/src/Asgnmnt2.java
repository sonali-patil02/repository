import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asgnmnt2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bluestone.com/");
WebElement ring=driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
Actions a=new Actions(driver);
a.moveToElement(ring).perform();
WebElement dimond=driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']"));
dimond.click();
WebElement price=driver.findElement(By.xpath("//section[@id=\"Price-form\"]/descendant::i[@class=\"icon-ion-chevron-down\"]"));
a.moveToElement(price).perform();
System.out.println(price.getText());
WebElement pop=driver.findElement(By.xpath("//section[@class=\"block sort-by pull-right\"]/span[contains(.,'Popular')]"));
a.moveToElement(pop).perform();
WebElement sort=driver.findElement(By.xpath("//a[contains(.,'Price Low to High')] "));
sort.click();
//driver.quit();
	}

}
