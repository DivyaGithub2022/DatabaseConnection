package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTwoHomework {

	public static void main(String[] args) {
		
		String userName = "pete";
		String password = "pl12345!";
		
		//Chrome browser property setup
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		//Browser initialization
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver.getTitle());
		
		//Open the given web page.
		driver.get("http://saltwm.eduquay.com/Index.aspx");
		driver.manage().window().maximize();
		
		//Enter credentials
		driver.findElement(By.id("txtuser")).sendKeys(userName, Keys.TAB);
		driver.findElement(By.id("txtpassword")).sendKeys(password, Keys.TAB);
				
		//Login
		driver.findElement(By.id("btnlogin")).click();
		
		//Close the session.
		//driver.quit();

	}

}
