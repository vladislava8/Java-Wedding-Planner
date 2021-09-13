package Controller;

import Model.Location;
import Model.MenuClass;
import Model.SortByGuestLastName;
import Model.Wedding;

import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Controller extends Wedding {
    public Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public Map<Integer, MenuClass> menus = new HashMap<Integer, MenuClass>();

    public void locationOptions() throws IOException {

    Scanner scanner = new Scanner(System.in);
    locations.put(1, new Location(1, "Roof Top Terrace"));
    locations.put(2, new Location(2, "Museum"));
    locations.put(3, new Location(3, "Indoor Terrace"));
    locations.put(4, new Location(4, "Main Ballroom"));
    locations.put(5, new Location(5, "Floral Ballroom"));

    for (int i=1;i<6;i++) {
        System.out.println(i + " " + locations.get(i).getDescription());
    }
        System.out.println("Enter 1 for Roof Top Terrace, 2 for Museum and etc.: ");
    int locChoice = scanner.nextInt();
        System.out.println(locations.get(locChoice).getDescription() + " is a great choice");
        Wedding planner = new Wedding();
        planner.write("Wedding Location: " + locations.get(locChoice).getDescription());

    }
    public void date(String a) throws IOException, ParseException {
        Wedding planner = new Wedding();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(a);
        planner.write("Wedding date: " + a);
    }

    public void graphicLine() throws IOException {
        Wedding planner = new Wedding();
        planner.write("________________________");
    }

    public void selectMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        menus.put(1, new MenuClass(1, "Plated menu: TRUFFLED CHICKEN\n" + "description:\n"+
                "Truffle Scented Breast of Chicken with Parmesan Herb Polenta and Local Vegetables\n"+
                "_______________________"));
        menus.put(2, new MenuClass(2, "Plated menu: GRILLED ATLANTIC SALMON\n" + "description:\n"+
                "With Sweet Corn, Tomato and Avocado Relish\n"+
                "_______________________"));
        menus.put(3, new MenuClass(3, "Plated menu: JUMBO SHRIMP SCAMPI\n" + "description:\n"+
                "Sautéed with Butter, Herbs, Garlic\n" +
                "and White Wine\n"+
                "_______________________"));
        menus.put(4, new MenuClass(4, "Buffet menu: THE JASMINE\n" + "description:\n"+
                "\uF0B7 Green Garden Salad with choice of Dressings\n" +
                "\uF0B7 Cold Boiled Shrimp with\n" +
                "Cocktail and Remoulade sauces\n" +
                "\uF0B7 Mushrooms Stuffed with\n" +
                "spinach and ham\n" +
                "\uF0B7 Blackened Chicken Alfredo with Pasta\n" +
                "\uF0B7 Parmesan Encrusted Eggplant with Marinara sauce and Mozzarella cheese\n" +
                "\uF0B7 Crab Cakes with Spicy Tomato Coulis\n" +
                "\uF0B7 Chef’s Choice of Vegetable\n" +
                "\uF0B7 Warm Breads and Butter\n" +
                "\uF0B7 Chocolate Dipped strawberries\n" +
                "\uF0B7 Mints and Nuts\n"+
                "_______________________"));

        menus.put(5, new MenuClass(5, "Buffet menu: THE GINGER\n" + "description:\n"+
                "\uF0B7 Mixed Field Greens with Strawberries, Apples, Pears and Hearts of Palm\n" +
                "\uF0B7 Pasta Salad Primavera\n" +
                "\uF0B7 Shrimp Scampi\n" +
                "\uF0B7 Grilled Chicken Breast Florentine\n" +
                "\uF0B7 Roast Sirloin Au Jus Carving Station**\n" +
                "\uF0B7 Roasted New Potatoes\n" +
                "\uF0B7 Chef’s Choice of Vegetables\n" +
                "\uF0B7 Warm Breads and Butter\n" +
                "\uF0B7 Chocolate Dipped Strawberries\n" +
                "\uF0B7 Mints and Nuts\n"+
                "_______________________"));

        for (int i=1;i<6;i++) {
            System.out.println(i + " " + menus.get(i).getMenuDescription());
        }
        System.out.println("Enter 1 for TRUFFLED CHICKEN, 2 for GRILLED ATLANTIC SALMON and etc. ");
        int menuChoice = scanner.nextInt();
        System.out.println(menus.get(menuChoice).getMenuDescription());
        Wedding planner = new Wedding();
        planner.write("Salad, Chefs Vegetable and Starch, Freshly Baked Bread, Fruit Punch and Coffee Service"+"Selected menu: " + menus.get(menuChoice).getMenuDescription());

    }
    public void WedSchedule(String a) throws IOException {
        setSchedule(a);
    }

    public void addSortedGuestList() throws IOException {
        write("___________________________");
        write("Guest list in alphabetical order:");
        SortByGuestLastName sort = new SortByGuestLastName();
        sort.sortLastName();
        Runtime rt = Runtime.getRuntime();
        String url = "C:\\Users\\vladi\\Programming\\Final.Wedding\\Wedding.txt";
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
    }

