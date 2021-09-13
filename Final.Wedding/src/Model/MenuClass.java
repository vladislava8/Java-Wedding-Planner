package Model;

import java.util.HashMap;
import java.util.Map;

public class MenuClass extends Wedding {

    public final int menuItemID;
    public final String menuDescription;
    public final Map<String, Integer> menuItems;

    public MenuClass(int menuItemID, String menuDescription) {
        this.menuItemID = menuItemID;
        this.menuDescription = menuDescription;
        this.menuItems = new HashMap<String,Integer>();
    }
    public void addMenu(String description, int key){
        menuItems.put(description, key);
    }

    public int getMenuItemID() {
        return menuItemID;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public Map<String, Integer> getMenuItems() {
        return new HashMap<String,Integer>(menuItems);
    }
}



