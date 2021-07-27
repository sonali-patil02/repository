import org.openqa.selenium.chrome.ChromeDriver;

public class demoLounch {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.navigate().to("http://www.facebook.com");
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println(title);
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.close();
	}

}
