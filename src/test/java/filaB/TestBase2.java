package filaB;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pagesTodoly.*;
import session.Session;

public class TestBase2 {

    protected MainPage mainPage= new MainPage();

    protected HomePage homePage = new HomePage();

    protected LoginSection loginSection = new LoginSection();

    protected SettingsSection settingsSection = new SettingsSection();
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}