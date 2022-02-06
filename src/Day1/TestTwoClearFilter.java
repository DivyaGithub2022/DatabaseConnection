package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTwoClearFilter {

	public static void main(String[] args) throws InterruptedException {
		
		String country1 = "India";
		String country2 = "Australia";
		
		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open webpage
		driver.get("https://www.bnymellon.com/apac/en/home.jsp");
		
		//Display the page title in Console
		System.out.println(driver.getTitle());
		
		//click Search icon
		driver.findElement(By.id("IconToChange")).click();
		
		//Enter country
		driver.findElement(By.id("site-search")).sendKeys(country1, Keys.ENTER);
		
		//Display the page title in Console
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		//'About # results' from the webpage for India
		System.out.println("--"+country1+"--");
		System.out.println(driver.findElement(By.xpath("//p[@class='tggray30 m-b-1 ng-binding']")).getText());
				
		//Display the page title in Console
		System.out.println(driver.getTitle());
		
		//Clear & Enter Search credential as 'Australia'
		driver.findElement(By.name("hero-search-input")).clear();
		driver.findElement(By.name("hero-search-input")).sendKeys(country2, Keys.ENTER);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//'About # results' from the webpage before filter
		System.out.println(country2+"--before filter--");
		System.out.println(driver.findElement(By.xpath("//*[@class='tggray30 m-b-1 ng-binding']")).getText());
		
		//Select 'All Content Type'
		driver.findElement(By.xpath("//*[@data-label='All Content Type']")).click();
		driver.findElement(By.xpath("//*[@data-val='business-insights']")).click();
		
		//'About # results' from the webpage after filter ---- NOT fetching ACTUAL result****
		System.out.println("--after filter--");
		System.out.println(driver.findElement(By.xpath("//*[@class='tggray30 m-b-1 ng-binding']")).getText());
		
		//clear filters
		driver.findElement(By.id("clear-all-selections")).click();
		
		//'About # results' from the webpage after filter ---- NOT fetching ACTUAL result****
		System.out.println("--after clear filters--");
		System.out.println(driver.findElement(By.xpath("//*[@class='tggray30 m-b-1 ng-binding']")).getText());
		
		//Close the session
		driver.quit();
		
	}

}
/*
 *  //To copy the results 'About 23 results' text into the Console***********NOT WORKING
 * System.out.println(driver.findElement(By.tagName(className("tggray30 m-b-1 ng-binding")).getText());
 * String resultText = driver.findElement(By.className("tggray30 m-b-1 ng-binding")).getText();
 * System.out.println(resultText);  
 * 
 *  //For 'About # results' from the webpage to display in console
 * System.out.println(driver.findElement(By.xpath("//*[@class='tggray30 m-b-1 ng-binding']")).getText());
 * System.out.println(driver.findElement(By.tagName("p")).getText());
 * System.out.println(driver.findElement(By.className("col-md-3")).getText());
 * 
 *  //Filter 'All Content Type' ------> 'Business Insights'
 * driver.findElement(By.linkText("All Content Type")).click(); ****** dint work
 * driver.findElement(By.className("i-angle-down")).click(); ****** dint work
 *  //SELECT is not working
 * WebElement AllContentTypeList = driver.findElement(By.className("refine-list"));
 * Select refineList = new Select(AllContentTypeList);
 * refineList.selectByVisibleText("Business Insights");
 *  
 * */
