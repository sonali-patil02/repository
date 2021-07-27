import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HTMLPage {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/selenium%20html/HTMLPAGE.html");
driver.manage().window().maximize();
Thread.sleep(1000);
Actions a=new Actions(driver);
WebElement mouse=driver.findElement(By.xpath("//select[@id='b']"));
Select s=new Select(mouse);
if(s.isMultiple())
{ s.selectByIndex(0);
Thread.sleep(1000);
s.selectByValue("323");
Thread.sleep(1000);
s.selectByVisibleText("324");
}
List<WebElement> values=s.getOptions();
for(WebElement value :values)
{
	System.out.println(value.getText());
	}
Thread.sleep(2000);
/*s.deselectByIndex(0);
Thread.sleep(1000);
s.deselectByValue("323");
Thread.sleep(1000);
s.deselectByVisibleText("324");*/
//s.deselectAll();
s.getFirstSelectedOption();
System.out.println("+1+".getText());
}
}