package StoreLogic;

import java.util.*;

public class Category {

    private String name;
    private List<String> product;

    public Category() { }

//---------------- Catalogs --------------------//
    public String GroceryList() {

        Map<String, String> catalog = new HashMap<>();
        catalog.put("Vegetables", "Vegetables");
        catalog.put("Meals", "Meals");
        catalog.put("Cheeses", "Cheeses");
        catalog.put("Fish", "Fish");

        switch (catalog.get("Fish")) {

            case "Vegetables":
                product = new ArrayList<>();
                product.add("Potato");
                product.add("Tomato");
                product.add("Garlic");
                product.add("Onion");
                product.add("Carrot");
                product.add("Cabbage");
                System.out.println(product);

            case "Meals":
                product = new ArrayList<>();
                product.add("Beef");
                product.add("Pork");
                product.add("Veal");
                product.add("Mutton");
                product.add("Turkey");
                product.add("Chicken");
                System.out.println(product);

            case "Cheeses":
                product = new ArrayList<>();
                product.add("Cheddar");
                product.add("Danish Blue");
                product.add("Mozzarella");
                product.add("Cream");
                product.add("Brie");
                product.add("Cottage");
                System.out.println(product);

            case "Fish":
                product = new ArrayList<>();
                product.add("Salmon");
                product.add("Tuna");
                product.add("Mackerel");
                product.add("Sardines");
                product.add("Herring");
                product.add("Perch");
                System.out.println(product);
        }
        return null;
    }
}
