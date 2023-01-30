package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class seleniumImplementation implements seleniumMethods{

    protected WebDriver driver;
    @Override
    public void click(WebElement element) {
        element.click();
    }

    @Override
    public void setupWebDriverForTesting(WebDriver driver) {

        this.driver=driver;

    }

    @Override
    public void openURL(String url) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-4.7.2\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
