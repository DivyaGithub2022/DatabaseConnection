package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTestOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		//log.info(System.getProperty("webdriver.chrome.driver"));
		WebDriver driver = new ChromeDriver();

		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("first_name")).sendKeys("Divya",Keys.ENTER);
		driver.findElement(By.id("last_name")).sendKeys("K");
		
		WebElement rolename = driver.findElement(By.id("job_role"));
		Select s = new Select(rolename);
		s.selectByVisibleText("IT Manager/Executive");
		
		WebElement Country = driver.findElement(By.id("country"));
		Select c = new Select(Country);
		c.selectByValue("AU");
		
		driver.findElement(By.id("email")).sendKeys("ABC@zmail.com",Keys.ENTER);
		driver.findElement(By.id("company")).sendKeys("Bank",Keys.ENTER);
		driver.findElement(By.name("user[postal_code]")).sendKeys("314",Keys.ENTER);
		
		driver.findElement(By.name("eula")).click();
		driver.findElement(By.id("submit_btn")).click();
		
		driver.findElement(By.linkText("Log In")).click();
		
		
		
		/*String companyBlank = 
		driver.findElement(By.id("company"));
		System.out.println(driver.findElement(By.className("errorContainer")).getText());
		if(companyBlank.contains("The Company field is required"))
			System.out.println("Company field blank, validation successful.");
		*/
		
		driver.quit();
		
	}

}
