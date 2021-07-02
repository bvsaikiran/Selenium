package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChromeTest {

	@Test
	public void browsermethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Selenium\\MySeleinumSessions\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike shoes");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.id("852q6m-j42ne4-eutyag-bx3w6v")).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("nav-cart-count")).click();
        driver.close();
	}
}
