package todoist;

import control.Button;

import org.openqa.selenium.By;

public class MenuSection {
    public Button addTask = new Button(By.xpath("//button[span[text()='Add task']]"));

    public Button inbox = new Button(By.xpath("//div[text()='Inbox']"));
}
