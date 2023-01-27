import java.util.HashMap;
import java.util.Set;
public class favSongs {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Blue Bird", "Ikimonogakari");
        userMap.put("Welcome to my hood", "DJ Khaled");
        userMap.put("Enemy", "Imagine Dragons");
        userMap.put("WHY DO FOOLS FALL IN LOVE" , "FRANKIE LYMON 1956");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}

