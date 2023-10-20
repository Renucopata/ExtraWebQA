package todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskCard {
    public TextBox taskName = new TextBox(By.xpath("//div[@aria-label=\"Task name\"]"));
    public Button button = new Button(By.xpath("//button[@data-testid=\"task-editor-submit-button\"]"));
}
