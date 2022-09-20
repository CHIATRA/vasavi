import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
          WebDriver driver= new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://www.flipkart.com/");
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
          driver.manage().window().maximize();
       WebElement element=   driver.findElement(By.xpath("//input[@class='_3704LK']"));
       element.sendKeys("redmi");
       element.submit();
       List<WebElement> elements=driver.findElements(By.xpath("//li[contains(text(),'4 GB RAM ')]/../../../div[1]"));
       for(int i=0;i<elements.size();i++)
       {
    	   WebElement e=elements.get(i);
    	   String phonetext=e.getText();
    	   System.out.println(phonetext);
       }
       driver.close();
	}

}
