package StoreLogic;

import java.util.ArrayList;
import java.util.List;

public class Category {

    protected static List<String> vegetables = new ArrayList<>();
    protected static List<String> meats =      new ArrayList<>();
    protected static List<String> cheeses =    new ArrayList<>();
    protected static List<String> fish =       new ArrayList<>();

    public Category() { }

    public String[] getVegetableProducts() {

        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Garlic");
        vegetables.add("Onion");
        vegetables.add("Carrot");
        vegetables.add("Cabbage");

        return vegetables.toArray(new String[0]);
    }

    public String[] getMeatProducts() {

        meats.add("Beef");
        meats.add("Pork");
        meats.add("Veal");
        meats.add("Mutton");
        meats.add("Turkey");
        meats.add("Chicken");

        return meats.toArray(new String[0]);
    }

    public String[] getCheeseProducts() {

        cheeses.add("Cheddar");
        cheeses.add("Danish Blue");
        cheeses.add("Mozzarella");
        cheeses.add("Cream");
        cheeses.add("Brie");
        cheeses.add("Cottage");

        return cheeses.toArray(new String[0]);
    }

    public String[] getFishProducts() {

        fish.add("Salmon");
        fish.add("Tuna");
        fish.add("Mackerel");
        fish.add("Sardines");
        fish.add("Herring");
        fish.add("Perch");

        return fish.toArray(new String[0]);
    }
}
