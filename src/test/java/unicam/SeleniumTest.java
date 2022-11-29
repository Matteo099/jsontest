package unicam;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    WebDriver driver;

    @BeforeEach
    void setup() throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://pros.unicam.it");
        Thread.sleep(2000);
    }

    @AfterEach
    void reset() {
        driver.close();
        driver.quit();
    }

    @Test
    void checkProsSite() throws InterruptedException {

        String at = driver.getTitle();
        String et = "PROS";
        String realEt = "PROS - PROcesses & Services lab | Computer Science division @Unicam";

        Thread.sleep(1000);

        Assertions.assertNotEquals(et, at);
        Assertions.assertEquals(realEt, at);
    }

    @Test
    void checkProdSiteSearch() throws InterruptedException {
        driver.findElement(By.className("toggle-search")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("search")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("search")).sendKeys("bprove\n");
        Thread.sleep(3000);
    }

    @Test
    void checkSPMSite() throws InterruptedException {

        String at = driver.getTitle();
        String et = "PROS - PROcesses & Services lab | Computer Science division @Unicam";

        Thread.sleep(1000);

        Assertions.assertEquals(et, at);
    }
}