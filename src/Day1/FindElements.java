package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
			//Launch Chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//Open webpage
			driver.get("https://www.bnymellon.com/apac/en/home.jsp");
			driver.manage().window().maximize();
			
			//Display the page title in Console
			//System.out.println(driver.getTitle());
			
			//to get all the links in the portal
			List<WebElement> l = driver.findElements(By.tagName("a"));
			for(WebElement e:l) {
				System.out.println(e.getText());
				
			}
			System.out.println("----------------------------------------------------------------------");
			
			driver.findElement(By.linkText("Contact")).click();
			List<WebElement> s = driver.findElements(By.tagName("select"));
			List<WebElement> category = s.get(0).findElements(By.tagName("option"));
			for(WebElement o:category) {
				System.out.println(o.getAttribute("data-topic-id"));
			}
	}

}
