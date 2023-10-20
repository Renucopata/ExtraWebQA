package pagesTodoly;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {

    public TextBox oldPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwOld']"));

    public TextBox newPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwNew']"));

    public Button saveButton = new Button(By.xpath("//button//span[text()='Ok']"));

}
