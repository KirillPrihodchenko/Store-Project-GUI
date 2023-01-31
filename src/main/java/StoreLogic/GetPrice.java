package StoreLogic;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class GetPrice extends Category{

    protected static Set<String> keys = new HashSet<>();

    public static Set<String> parsingKeyVegetables(String value) {

        for (Map.Entry<String, String> entry : vegetables.entrySet()) {

            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public static Set<String> parsingKeyMeats(String value) {

        for (Map.Entry<String, String> entry : vegetables.entrySet()) {

            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public static Set<String> parsingKeyCheeses(String value) {

        for (Map.Entry<String, String> entry : vegetables.entrySet()) {

            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public static Set<String> parsingKeyFish(String value) {

        for (Map.Entry<String, String> entry : vegetables.entrySet()) {

            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

   /** overriding coming soon*/
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((vegetables.isEmpty()) ? 0 : vegetables.hashCode());
//        result = prime * result + ((meats.isEmpty()) ? 0 : meats.hashCode());
//        result = prime * result + ((cheeses.isEmpty()) ? 0 : cheeses.hashCode());
//        result = prime * result + ((fish.isEmpty()) ? 0 : fish.hashCode());
//
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//
//        if (obj == this) {
//            return true;
//        }
//        if (obj == null || obj.getClass() != this.getClass()) {
//            return false;
//        }
//
//        Category category = (Category) obj;
//        return ((!vegetables.isEmpty()) &&
//                (!meats.isEmpty()) &&
//                (!cheeses.isEmpty()) &&
//                (!fish.isEmpty()));
//    }
}
