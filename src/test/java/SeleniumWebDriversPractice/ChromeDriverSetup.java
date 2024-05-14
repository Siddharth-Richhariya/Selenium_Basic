package SeleniumWebDriversPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.net.SocketException;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class ChromeDriverSetup {
    static WebDriver driver;
    public static void main(String[] args) {
        chromedriver().setup();
        driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com/search?q=chuchi");

            Thread.sleep(1000);
            driver.close();
        } catch(InterruptedException e) {
            System.out.println("Interrupted Exception");
        }


    }
}
