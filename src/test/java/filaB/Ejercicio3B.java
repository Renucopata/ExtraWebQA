package filaB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

public class Ejercicio3B extends TestBase{

    private Random rand = new Random();
    @Test
    public void verifyPregunta3() throws InterruptedException {
        mainPage.registerButton.click();

        registerSection.emailTxtBox.setText("RenucoExtra"+new Date().getTime()+"@gmail.com");
        registerSection.pwdTxtBox.setText("Renuc0pata");
        registerSection.signUpButton.click();

        Thread.sleep(5000);

        registerSection.nameTxtBox.setText("Renuco");
        registerSection.continueButton.click();


        Thread.sleep(5000);
        registerSection.skip.click();

        Thread.sleep(5000);
        registerSection.launchButton.click();
        String projectName = "ProjectExtra";
       // homePage.projectSection.click();
        Thread.sleep(5000);
        homePage.menuButton.click();
        Thread.sleep(5000);
        homePage.addProjectButton.click();
        Thread.sleep(5000);
        projectSesion.projectName.setText(projectName);
        projectSesion.buttonColor.click();
        projectSesion.blueButton.click();
        projectSesion.addButton.click();

        Assertions.assertEquals(true, homePage.checkNewProject(projectName).isControlDisplayed());


    }
}
