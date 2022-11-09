package StoreLogic;

import java.util.*;

public class Category {

    protected static List<String> product = new ArrayList<>();
    //private static final Map<String, String[]> catalog = new HashMap<>();

    public Category() {

//        catalog.put("Vegetables", category.getVegetableProducts());
//        catalog.put("Meats", category.getMeatProducts());
//        catalog.put("Cheeses", category.getCheeseProducts());
//        catalog.put("Fish", category.getFishProducts());
    }

    public String[] getVegetableProducts() {

        product.add("Potato");
        product.add("Tomato");
        product.add("Garlic");
        product.add("Onion");
        product.add("Carrot");
        product.add("Cabbage");

        return new String[product.size()];
    }

    public String[] getMeatProducts() {

        product.add("Beef");
        product.add("Pork");
        product.add("Veal");
        product.add("Mutton");
        product.add("Turkey");
        product.add("Chicken");

        return new String[product.size()];
    }

    public String[] getCheeseProducts() {

        product.add("Cheddar");
        product.add("Danish Blue");
        product.add("Mozzarella");
        product.add("Cream");
        product.add("Brie");
        product.add("Cottage");

        return new String[product.size()];
    }

    public String[] getFishProducts() {

        product.add("Salmon");
        product.add("Tuna");
        product.add("Mackerel");
        product.add("Sardines");
        product.add("Herring");
        product.add("Perch");

        return new String[product.size()];
    }
}
