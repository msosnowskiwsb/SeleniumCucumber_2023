package pl.gda.wsb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    public static void main(String[] args){

        // Declaration and instantiation of driver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Launch Logintegra website
        driver.navigate().to("https://logintegra.com/");

        // Click to Knowledge button
        driver.findElement(By.xpath("//*[@id=\"menu-item-2168\"]/a")).click();

        // Click to Article
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/h3/a")).click();

        // Get page title and print in console
        System.out.println(driver.getTitle());

        // Quit
        driver.quit();
    }
}