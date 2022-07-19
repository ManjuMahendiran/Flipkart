package towny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zaigo\\eclipse-workspace\\Towny\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
}
}
