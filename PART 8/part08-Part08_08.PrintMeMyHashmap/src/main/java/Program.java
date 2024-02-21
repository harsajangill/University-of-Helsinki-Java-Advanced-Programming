
import java.util.HashMap;

public class Program {
    //prints all the keys in the hashmap given as parameter
    public static void printKeys(HashMap<String,String> hashmap){
        for (String value : hashmap.keySet()){
            System.out.println(value);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String value : hashmap.keySet()){
            if (value.contains(text)){
                System.out.println(value);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        text = stringSanitazion(text);
        for (String key : hashmap.keySet()){
            if (key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static String stringSanitazion(String text){
        if (text == null) {
            text = "";
        }

        text = text.toLowerCase();
        return text.trim();
    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

}
