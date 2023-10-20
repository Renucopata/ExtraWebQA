package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button loginButton = new Button(By.xpath("//li//a[text()='Log in']"));
    public Button registerButton = new Button(By.xpath("(//a[text()='Start for free'])[1]"));
}
