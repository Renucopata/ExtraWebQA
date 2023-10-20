package session;

import config.Configuration;
import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Session {
    private static Session session;
    private WebDriver browser;
    private Session(){
        browser = FactoryBrowser.make("firefox").create();
        browser.manage().window().maximize();
        browser.get(Configuration.host);
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }
    public static Session getInstance(){
        if (session == null)
            session = new Session();
        return session;
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void closeSession(){
        browser.quit();
        session = null;
    }
}
