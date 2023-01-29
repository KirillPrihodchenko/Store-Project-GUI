package StoreLogic;

import java.util.HashMap;
import java.util.Map;

public class Category {

    protected static Map<String, String> vegetables = new HashMap<>();
    protected static Map<String, String> meats      = new HashMap<>();
    protected static Map<String, String> cheeses    = new HashMap<>();
    protected static Map<String, String> fish       = new HashMap<>();

    public Category() { }

    static {

        vegetables.put("10.0", "Onion");
        vegetables.put("17.9", "Cabbage");
        vegetables.put("21.7", "Tomato");
        vegetables.put("12.3", "Potato");
        vegetables.put("15.2", "Pepper");
        vegetables.put("8.3", "Garlic");

        meats.put("32.1", "Pork");
        meats.put("29.9", "Beef");
        meats.put("35.0", "Turkey");
        meats.put("34.6", "Horsemeat");

        cheeses.put("22.4", "Cheddar");
        cheeses.put("25.3", "Danish Blue");
        cheeses.put("19.7", "Mozzarella");
        cheeses.put("15.5", "Cream");
        cheeses.put("31.2", "Brie");
        cheeses.put("29.9", "Cottage");

        fish.put("29.4", "Salmon");
        fish.put("36.0", "Tuna");
        fish.put("21.5", "Mackerel");
        fish.put("19.8", "Sardines");
        fish.put("31.2", "Herring");
        fish.put("32.9", "Perch");

    }

    public static String[] getVegetableProducts() {

        return vegetables.values().toArray(new String[0]);
    }

    public static String[] getMeatProducts() {

        return meats.values().toArray(new String[0]);
    }

    public static String[] getCheeseProducts() {

        return cheeses.values().toArray(new String[0]);
    }

    public static String[] getFishProducts() {

        return fish.values().toArray(new String[0]);
    }

}