import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateofBirth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement create=driver.findElement(By.xpath("//div[@class=\"_6ltg\"]/descendant::a[@role=\"button\"]"));
		create.click();
		Thread.sleep(1000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
Select s=new Select(day);
s.selectByVisibleText("2");
Thread.sleep(1000);
WebElement date=driver.findElement(By.xpath("//select[@id='date']"));
Select s1=new Select(date);
s1.selectByIndex(9);
Thread.sleep(1000);
WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
Select s2=new Select(month);
s2.selectByIndex(9);
WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
Select s3=new Select(Year);
s3.selectByIndex(2020);
WebElement male =driver.findElement(By.xpath("//input[@value=2']"));
male.click();
System.out.println("Genderis: "+male.isSelected());
org.openqa.selenium.Point loc=male.getLocation();
}

}
