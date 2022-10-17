package StoreLogic;

import java.util.*;

public class Category {

    private String name;
    private List<String> product;
    private Map<String, String> catalog;
    public Category() { }

    public String GroceryList() {

        catalog = new HashMap<>();
        catalog.put("Vegetables", "Vegetables");
        catalog.put("Meals", "Meals");
        catalog.put("Cheeses", "Cheeses");
        catalog.put("Fish", "Fish");

        switch (catalog.get("Fish")) {

            case "Vegetables" -> {
                product = new ArrayList<>();
                product.add("Potato");
                product.add("Tomato");
                product.add("Garlic");
                product.add("Onion");
                product.add("Carrot");
                product.add("Cabbage");
                return String.valueOf(product);
            }

            case "Meals" -> {
                product = new ArrayList<>();
                product.add("Beef");
                product.add("Pork");
                product.add("Veal");
                product.add("Mutton");
                product.add("Turkey");
                product.add("Chicken");
                return String.valueOf(product);
            }

            case "Cheeses" -> {
                product = new ArrayList<>();
                product.add("Cheddar");
                product.add("Danish Blue");
                product.add("Mozzarella");
                product.add("Cream");
                product.add("Brie");
                product.add("Cottage");
                return String.valueOf(product);
            }

            case "Fish" -> {
                product = new ArrayList<>();
                product.add("Salmon");
                product.add("Tuna");
                product.add("Mackerel");
                product.add("Sardines");
                product.add("Herring");
                product.add("Perch");
                return String.valueOf(product);
            }
        }
        return null;
    }
}
