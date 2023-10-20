package control;

import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class Items extends GroupControl{

    private List<Item> list;

    public Items(By locator) {
        super(locator);
    }

    public List<Item> getList() {
        getGroup();
        list = controls.stream().map(element -> {
            Item item = new Item(element.locator);
            item.control = element.control;
            return item;
        }).collect(Collectors.toList());
        return list;
    }
}
