package omseliniumautomations.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        // Specify the path to the chromedriver executable
        // String chromeDriverPath =
        // "C:\\Softwares\\chromedriver-win64\\chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        // Create a ChromeOptions object and add the headless mode arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://3.144.197.180:8085/contact.html");

        driver.findElement(By.id("inputName")).sendKeys("Om Prakash");
        driver.findElement(By.id("inputNumber")).sendKeys("12345678910");
        driver.findElement(By.id("inputMail")).sendKeys("ponnaluom@gmail.com");
        driver.findElement(By.id("inputMessage")).sendKeys("I got it");
        driver.findElement(By.id("my-button")).click();
        // driver.findElement(By.xpath("//button")).click();

        Thread.sleep(10000);

        String excpected_title = "Message Sent";

        System.out.println(excpected_title);

        // driver.findElement(By.id("response"))

        String actual_title = driver.findElement(By.id("response")).getText();

        System.out.println(actual_title);

        if (excpected_title.equals(actual_title)) {
            System.out.println("login successfull");
        } else {
            System.out.println("login Failed");
        }

        driver.quit();
    }
}
