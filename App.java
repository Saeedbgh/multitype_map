import java.util.Objects;

public class App {
    public static void main(String[] args) {
        MultiTypeHashMap<String> multiTypeHashMap = new MultiTypeHashMap<>();
        multiTypeHashMap.put("key1", 22);
        multiTypeHashMap.put("key2", "String obj1");


        Integer i = multiTypeHashMap.get("key1", Integer.class);
        String s = multiTypeHashMap.get("key2", String.class);
        String nullValue = multiTypeHashMap.get("key1", String.class);

        System.out.println(i);
        System.out.println(s);
        System.out.println(nullValue);


    }
}
