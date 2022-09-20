import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;



public class Assignment_2 {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
           WebDriver driver= new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://www.flipkart.com/");
           driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
           driver.manage().window().maximize();
        WebElement element=   driver.findElement(By.xpath("//input[@class='_3704LK']"));
        element.sendKeys("winter heater");
        element.submit();
        WebElement element1=driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
       
        element1.click();
        Set<String> winhandle=driver.getWindowHandles();
        
      Iterator<String>id=winhandle.iterator();
      while(id.hasNext())
      {
    	  String win=id.next();
    	  String crnt=driver.switchTo().window(win).getTitle();
    	  if(crnt.contains("darshnam world"))
    	  {
    		  break;
    	  }
      }
      String serchprdct=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
      driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
      String cartprdct=driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
      if(serchprdct.equals(cartprdct))
      {
    	  System.out.println("test case passed");
    	  
      }
      else
      {
    	  System.out.println("test case failed");
    	  
      }
        
          
        driver.quit();

	}

}
