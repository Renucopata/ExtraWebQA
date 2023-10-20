package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class HomePage {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Label projectSection = new Label(By.xpath("//div[text()='Projects']"));
    public Button addProjectButton = new Button(By.xpath("//button[@aria-label='Add project']"));

    public Button menuButton = new Button(By.xpath("//button[@class='left_menu_toggle top_bar_btn']"));



    public Label checkNewProject(String text){
        return new Label(By.xpath("//span[text()='" + text + "']"));
    }
//    public Label projectName = new Label(By.xpath("//span[text()='" + name + "'][last()]"));
}
