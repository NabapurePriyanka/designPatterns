package creational.factory.UIFactory;

import creational.factory.components.button.Button;
import creational.factory.components.button.IosButton;
import creational.factory.components.dropdown.AndroidDropdown;
import creational.factory.components.dropdown.Dropdown;
import creational.factory.components.dropdown.IosDropdown;
import creational.factory.components.menu.IosMenu;
import creational.factory.components.menu.Menu;

public class IosFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
