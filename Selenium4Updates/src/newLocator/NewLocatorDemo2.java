package newLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.List;

public class NewLocatorDemo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software testing\\chrome driver\\NewChromeDriver\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> SocialAccount = driver.findElements(withTagName("img").below(By.xpath("//a[text()='OrangeHRM, Inc']")));
		
		System.out.println("Total Count is:"+SocialAccount.size());
		
		for(WebElement ele : SocialAccount)
		{
			System.out.println(ele.getAttribute("alt"));
		}
	}
	

}
