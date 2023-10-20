package filaA;

import session.Session;
import todoly.MainPage;
import todoly.MenuSection;
import todoly.ProjectsSection;
import todoly.SignInSection;
import org.junit.jupiter.api.*;

import java.util.Date;

public class Ejercicio3A {
    MainPage mainPage = new MainPage();
    SignInSection signInSection = new SignInSection();
    MenuSection menuSection = new MenuSection();
    ProjectsSection projectsSection = new ProjectsSection();


    static String email;
    static String password;
    static String user;

    static String projectName;
    


    @BeforeAll
    public static void setup() {
        email = "renuco"+new Date().getTime()+"@gmail.com";
        password = "Renuc0pata";
        user = "Renuco Extra";
        projectName = "Proyecto Extra";
    }

    @BeforeEach
    public void open() {
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void close() {
        Session.getInstance().closeSession();
    }

    @Test
    public void createUserProject() throws InterruptedException {
        mainPage.signInButton.click();
        creatingUser();
        createProject();
    }

    public void creatingUser() {
        signInSection.fullNameInput.setText(user);
        signInSection.emailInput.setText(email);
        signInSection.passwordInput.setText(password);
        signInSection.check.click();
        signInSection.signin.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR al iniciar sesion");
    }

    public void createProject() throws InterruptedException {
        projectsSection.addProjectButton.click();
        projectsSection.textBoxProjectName.setText(projectName);
        projectsSection.addButton.click();

        Thread.sleep(1000);

        int lastProjectIndex = projectsSection.getProjects(projectName).size();
        Assertions.assertEquals(projectName, projectsSection.getProjects(projectName).get(lastProjectIndex - 1).getName(), "ERROR proyecto creado no encontrado!");
    }
}
