package GoogleTest;

import org.openqa.selenium.By;
import pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Driver/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		GoogleSearchPage.Textbox_search(driver).sendKeys("Automation step by step");
		//driver.findElement(By.name("q")).sendKeys("Automation");
		GoogleSearchPage.butt_search(driver).click();
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
	
	
	

}
