import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GURU99testupload {

	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.id("file_wraper0")).click();
			Runtime r=Runtime.getRuntime();
			r.exec("‪‪‪E:\\sonali.exe.txt");
	}

}
