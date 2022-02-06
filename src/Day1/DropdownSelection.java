package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelection {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bnymellon.com/apac/en/home.jsp");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println("----------------------------------------------------------------------");
		
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		// To display the status 'Topic > Question > Phone > Your > Info > Summary'
		System.out.println(driver.findElement(By.xpath("//div[@id='topic']")));
		//Got the output as below for the above statement --
		//[[ChromeDriver: chrome on WINDOWS (d158957c0f495926d7c0b8543c417e04)] -> xpath: //div[@id='topic']]
		
		//fetch the two dropdown box values into LIST
		List<WebElement> topic = driver.findElements(By.tagName("select"));
		//fetch the first dropdown box values into a new LIST
		int i=0;
		List<WebElement> category = topic.get(i).findElements(By.tagName("option"));
	/* 
		for(WebElement w:category) {
			//printing the attribute values for the dropdown values
			System.out.println(w.getAttribute("data-topic-id"));
		}
	*/
		System.out.println("----------------");
		for(WebElement e:category) {
			//printing the linktext for the dropdown values
			System.out.println(e.getText());
		}
		
		System.out.println("----------------");
		//fetch the second dropdown box values into another new LIST
		List<WebElement> subCategory = topic.get(i+1).findElements(By.tagName("option"));
		List<WebElement> subCareers = topic.get(i+2).findElements(By.tagName("option"));
		List<WebElement> st = driver.findElements(By.className("suptopics_list"));
	/*
		 for (WebElement s:subCategory) {
			//printing the attribute values for the dropdown values
			System.out.println(s.getAttribute("data-subtopic-id"));
		}
	*/
		for (WebElement sc:subCategory) {
			//printing the linktext for the dropdown values
			System.out.println(sc.getText());
		}
		for (WebElement scr:subCareers) {
			//printing the linktext for the dropdown values
			System.out.println("****");
			System.out.println(scr.getAttribute("data-subtopic-id"));
			//System.out.println(scr.getText());
		}
		
		System.out.println("------------");
		
		for(WebElement cat:category) {
			System.out.println("--  --  --  --");
			System.out.println(cat.getText());
			cat.isSelected();
						
			for(WebElement sc:subCategory) {
				
				driver.findElements(By.tagName("select"));
				List<WebElement> option = driver.findElements(By.tagName("option"));
				//subCat.isSelected();
				//.findElement(By.tagName("select")).click();
				//System.out.println(subTop.getText());
				
				for(WebElement op:option) {
					System.out.println(op.getText());
					
					driver.findElement(By.xpath("//a[@class='btn btn-primary step']")).click();
					System.out.println("Click NEXT button\n");
					Thread.sleep(2000);
					System.out.println("Page topic is '" + 
							driver.findElement(By.xpath("//span[@id='selectedTopic']")).getText()+"'");
					driver.findElement(By.linkText("Contact")).click();
					
				}
				
								
			}
								
		}
		/*
		cat.click();
		subCategory.get(0).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary step']")).click();
		//driver.findElement(By.linkText("Next")).click();
		//System.out.println(driver.getTitle());
		System.out.println("Page topic is '" + driver.findElement(By.xpath("//span[@id='selectedTopic']")).getText()+"'");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("topic")).click();
		driver.findElement(By.linkText("Contact")).click();
		
		category.get(1).click();
		subCategory.get(0).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary step']")).click();
		//driver.findElement(By.linkText("Next")).click();
		//System.out.println(driver.getTitle());
		System.out.println("Page topic is '" + driver.findElement(By.xpath("//span[@id='selectedTopic']")).getText()+"'");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("topic")).click();
		driver.findElement(By.linkText("Contact")).click();
		
		category.get(2).click();
		subCategory.get(0).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary step']")).click();
		//driver.findElement(By.linkText("Next")).click();
		//System.out.println(driver.getTitle());
		System.out.println("Page topic is '" + driver.findElement(By.xpath("//span[@id='selectedTopic']")).getText()+"'");
		Thread.sleep(2000);
		*/
		/*
		//To display the status progress labels
		//System.out.println(driver.findElement(By.tagName("div")).getAttribute("id"));
		List<WebElement> progressLabel = driver.findElements(By.className("progress-labels"));
		progressLabel.get(0).findElement(By.className("progress-labels"));
		System.out.println(driver.findElement(By.tagName("li")).getText());
		//List<WebElement> label = progressLabel.get(0).findElements(By.tagName("li"));
		//System.out.println(label.);
		*/
	}

}
