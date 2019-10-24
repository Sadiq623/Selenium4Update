package openTabDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software testing\\chrome driver\\NewChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent Tab:"+parent);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		WebDriver newTab = driver.switchTo().newWindow(WindowType.WINDOW);
		
        String child = driver.getWindowHandle();
		
		System.out.println("Child Tab:"+child);
		
		newTab.get("https://www.google.com");
		
		newTab.findElement(By.name("q")).sendKeys("amazon.in");
		
		Thread.sleep(5000);
		
		newTab.close();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
