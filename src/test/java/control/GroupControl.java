package control;

import session.Session;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupControl {
    protected By locator;
    protected List<Control> controls;

    public GroupControl(By locator) {
        this.locator = locator;
        this.controls = new ArrayList<>();
    }

    public void getGroup() {
        controls = Session.getInstance().getBrowser().findElements(this.locator).stream().map(webElement -> {
            Control element = new Control(this.locator);
            element.control = webElement;
            return element;
        }).collect(Collectors.toList());
    }

}
