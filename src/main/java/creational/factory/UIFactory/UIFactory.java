package creational.factory.UIFactory;

import creational.factory.components.button.Button;
import creational.factory.components.dropdown.Dropdown;
import creational.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
