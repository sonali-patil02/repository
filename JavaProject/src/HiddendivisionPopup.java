import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddendivisionPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		WebElement pass=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		driver.findElement(By.id("username")).sendKeys(username.getText());
		driver.findElement(By.name("pwd")).sendKeys(pass.getText(),Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
	WebElement text=	driver.findElement(By.xpath("//td[@class='aboutCopyright']"));
		System.out.println(text.getText());
	}

}
