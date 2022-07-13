package towny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Towny_Login_Test {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Zaigo\\eclipse-workspace\\Towny\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement textEmail = driver.findElement(By.id("email"));
	    textEmail.sendKeys("kjhuserg");
	    
	    WebElement textpassword = driver.findElement(By.id("pass"));
	    textpassword.sendKeys("manjuuu");
	    
	    WebElement clickbutton = driver.findElement(By.name("login"));
	    clickbutton.click();
	    
	    WebElement errorfield = driver.findElement(By.className("_9ay7"));
		String text = errorfield.getText();
		System.out.println(text);
        driver.quit();
	}

}
