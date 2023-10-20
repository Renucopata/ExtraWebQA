package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectSesion {


    public TextBox projectName = new TextBox(By.xpath("//input[@id='edit_project_modal_field_name']"));

    public Button buttonColor = new Button(By.xpath("//button[@aria-labelledby='edit_project_modal_field_color_label']"));

    public Button blueButton = new Button(By.xpath("//span[text()='Blue']"));

    public Button addButton = new Button(By.xpath("//button[@type='submit']"));


}
