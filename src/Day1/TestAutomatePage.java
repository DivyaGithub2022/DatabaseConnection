package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomatePage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bnymellon.com/apac/en.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		//driver.findElement(By.name("Solutions")).click();
		driver.findElement(By.xpath("//a[@title='Solutions']")).click();
		driver.findElement(By.xpath("//a[@title='Alternative Asset Managers']")).click();
		driver.findElement(By.xpath("//a[@title='Overview']")).click();
		
		Thread.sleep(3000);
		String titleAssetManager = driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.findElement(By.tagName("span"));
		if(titleAssetManager.contentEquals("Overview - Alternative Asset Managers"))
			System.out.println("Overview - Alternative Asset Managers page is loaded successfully.");
		else
			System.out.println("Page loading Failed.");
		
		driver.findElement(By.xpath("//a[@title='Solutions']")).click();
		driver.findElement(By.xpath("//a[@title='Alternative Asset Managers']")).click();
		driver.findElement(By.xpath("//a[@title='Alternative Asset Managers']")).click();
		driver.findElement(By.xpath("//a[@title='Capital Markets, Financing & Liquidity']")).click();
		
		Thread.sleep(3000);
		String titleCapitalMarkets = driver.getTitle();
		System.out.println(titleCapitalMarkets);
		
		if(titleCapitalMarkets.contentEquals("Capital Markets, Financing and Liquidity"))
			System.out.println("Capital Markets, Financing and Liquidity is loaded successfully.");
		else
			System.out.println("Page loading Failed.");
		
		driver.findElement(By.xpath("//a[@title='Solutions']")).click();
		driver.findElement(By.xpath("//a[@title='Alternative Asset Managers']")).click();
		driver.findElement(By.xpath("//a[@title='Alternative Asset Managers']")).click();
		driver.findElement(By.xpath("//a[@title='Data & Analytics']")).click();
		
		Thread.sleep(3000);
		String titleDataAnalytics = driver.getTitle();
		System.out.println(titleDataAnalytics);
		
		
		driver.quit();
		
	}

}
