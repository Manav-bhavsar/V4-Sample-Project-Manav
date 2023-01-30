package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface seleniumMethods {

    public void click(WebElement element);
    public void setupWebDriverForTesting(WebDriver driver);
    public void openURL(String url);

}
