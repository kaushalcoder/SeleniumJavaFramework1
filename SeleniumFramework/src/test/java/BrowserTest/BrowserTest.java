package BrowserTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import GoogleTest.google;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("Projectpath" +projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/ChromeDriver/chromedriver.exe");
		//@pagesetup
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		
		
		
		driver.close();
	}

}
