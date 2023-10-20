package todoly;

import control.Button;
import control.Item;
import control.Items;
import control.TextBox;
import org.openqa.selenium.By;

import java.util.List;

public class ItemsSection {
    public TextBox newItemInput = new TextBox(By.id("NewItemContentInput"));
    public Button newItemButton = new Button(By.id("NewItemAddButton"));
    public Items items;
    public TextBox newItemNameInput = new TextBox(By.id("ItemEditTextbox"));

    public List<Item> getItems(String itemName) {
        items = new Items(By.xpath(String.format("//div[@class=\"ItemContentDiv\" and text()='%s']", itemName)));
        return items.getList();
    }
}