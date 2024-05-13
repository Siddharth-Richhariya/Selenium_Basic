package SeleniumWebDriversPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class ChromeDriverSetup {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.close();
    }
}
