package filaB;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import session.Session;

public class TestBase {

    protected MainPage mainPage= new MainPage();

    protected HomePage homePage = new HomePage();

    protected LoginSection loginSection = new LoginSection();

    protected ProjectSesion projectSesion = new ProjectSesion();

    protected RegisterSection registerSection = new RegisterSection();
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
