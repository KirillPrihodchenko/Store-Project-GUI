package StoreLogic;

import java.util.ArrayList;
import java.util.List;

public class GetPrice extends Category{

    protected static List<Double> parsedKey = new ArrayList<>();


    public static List<Double> parsingKeyVegetables(String value) {

        for(String keys: vegetables.keySet()){

            double keyToDouble = Double.parseDouble(keys);
            parsedKey.add(keyToDouble);
        }
        return parsedKey;
    }

    public static List<Double> parsingKeyMeats() {

        for(String keys: meats.keySet()){

            double keyToDouble = Double.parseDouble(keys);
            parsedKey.add(keyToDouble);
        }
        return parsedKey;
    }

    public static List<Double> parsingKeyCheeses() {

        for(String keys: cheeses.keySet()){

            double keyToDouble = Double.parseDouble(keys);
            parsedKey.add(keyToDouble);
        }
        return parsedKey;
    }

    public static List<Double> parsingKeyFish() {

        for(String keys: fish.keySet()){

            double keyToDouble = Double.parseDouble(keys);
            parsedKey.add(keyToDouble);
        }
        return parsedKey;
    }
}
