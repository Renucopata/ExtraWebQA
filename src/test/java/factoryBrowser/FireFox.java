package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox implements IBrowser{
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.firefox.driver","src/test/resources/fireFox/geckodriver.exe");
        FirefoxDriver fireFox = new FirefoxDriver();
        return fireFox;
    }
}
