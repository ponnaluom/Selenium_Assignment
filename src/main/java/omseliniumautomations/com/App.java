package omseliniumautomations.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("ponnaluom@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Om@12345");
        driver.findElement(By.xpath("//button")).click();

        Thread.sleep(10000);

        String excpected_title = "(20+) Facebook";

        System.out.println(excpected_title);

        String actual_title = driver.getTitle();

        System.out.println(actual_title);

        if (excpected_title.equals(actual_title)) {
            System.out.println("login successfull");
        } else {
            System.out.println("login Failed");
        }

        driver.quit();
    }
}