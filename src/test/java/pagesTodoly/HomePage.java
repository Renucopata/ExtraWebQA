package pagesTodoly;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class HomePage {

//    private  String nameProject;
//
//    public String getNameProject() {
//        return nameProject;
//    }
//
//    public void setNameProject(String nameProject) {
//        this.nameProject = nameProject;
//    }

    public Button addNewProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox nameProjectTxtBox = new TextBox(By.id("NewProjNameInput"));

    public Button addProjectButton = new Button(By.id("NewProjNameButton"));

    public Button settingsButton = new Button(By.xpath("//a[text()='Settings']"));

    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));

//    public Label newProject = new Label(By.xpath("(//li//td[text()='"+nameProject+"'])[last()]"));


}
