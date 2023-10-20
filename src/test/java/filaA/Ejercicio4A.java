package filaA;

import config.Configuration;
import session.Session;
import todoist.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4A {
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();
    TaskSection taskSection = new TaskSection();
    TaskCard taskCard = new TaskCard();

    @BeforeEach
    public void open() {
        Session.getInstance().getBrowser().get(Configuration.host);
    }

    @AfterEach
    public void close() {
        Session.getInstance().closeSession();
    }

    @Test
    public void addTask() throws InterruptedException {
        login();
        Thread.sleep(10000);
        menuSection.addTask.click();
        Thread.sleep(10000);
        //taskCard.taskName.click();
        System.out.println("Paso click");
        taskCard.taskName.setText("Tarea Extra");
        Thread.sleep(5000);
        taskCard.button.click();
        Thread.sleep(1000);

        menuSection.inbox.click();

        Assertions.assertTrue(taskSection.taskExists("Tarea Extra"), "ERROR Task doesn't exists!");
    }

    public void login() {
        loginSection.emailInput.setText(Configuration.user);
        loginSection.passwordInput.setText(Configuration.password);
        loginSection.confirmationButton.click();
    }


}
