package unicam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest2 {

    WebDriver driver;

    @BeforeEach
    void setup() throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://localhost:8080/maenwebapp");
        Thread.sleep(2000);
    }

    @AfterEach
    void reset() {
        //driver.close();
        //driver.quit();
    }


    @Test
    void checkSPMSite() throws InterruptedException {

        String at = driver.getTitle();
        String et = "SPM 2022";

        Thread.sleep(1000);

        Assertions.assertEquals(et, at);
    }
}