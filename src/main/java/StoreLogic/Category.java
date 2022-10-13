package StoreLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Category {

    private String name;
    private static List<String> ItemProductsCatalog;
    private static Map<String, String> MapValue = new HashMap(ItemProductsCatalog.size());

    public Category() { }

//---------------- Catalogs --------------------//
    public String CatalogProducts() {

        ItemProductsCatalog = new ArrayList<>();
        ItemProductsCatalog.add("Fruit");
        ItemProductsCatalog.add("Vegetables");
        ItemProductsCatalog.add("Meats");
        ItemProductsCatalog.add("Cheeses");
        ItemProductsCatalog.add("Bakery products");

        return "hello";
    }

    public String GroceryList() {

        return null;
    }
}
