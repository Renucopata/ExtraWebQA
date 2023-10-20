package filaB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4B extends TestBase2{

    @Test
    public void verifyPregunta3() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("renucoExtra123@gmail.com");
        loginSection.pwdTxtBox.setText("123456"); //Cambiar despues de correr el test
        loginSection.loginButton.click();

        Thread.sleep(3000);

        homePage.settingsButton.click();

        Thread.sleep(3000);


        settingsSection.oldPwdTxtBox.setText("123456");
        settingsSection.newPwdTxtBox.setText("12345");

        settingsSection.saveButton.click();

        Thread.sleep(5000);

        homePage.logoutButton.click();

        Thread.sleep(5000);

        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("renucoExtra123@gmail.com");
        loginSection.pwdTxtBox.setText("12345");
        loginSection.loginButton.click();

        Thread.sleep(5000);
        Assertions.assertTrue(homePage.logoutButton.isControlDisplayed(), "ERROR, no se ha podido cambiar la contraseña");



    }


}

