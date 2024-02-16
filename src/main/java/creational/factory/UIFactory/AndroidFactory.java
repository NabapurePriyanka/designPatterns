package creational.factory.UIFactory;

import creational.factory.components.button.AndroidButton;
import creational.factory.components.button.Button;
import creational.factory.components.dropdown.AndroidDropdown;
import creational.factory.components.dropdown.Dropdown;
import creational.factory.components.menu.AndroidMenu;
import creational.factory.components.menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
