public class App {
    public static void main(String[] args) {
        MultiTypeHashMap<String> map1 = new MultiTypeHashMap<>();
        map1.put("B","A");
        System.out.println(map1.get(map1));

        String value1 = map1.get("B", String.class);
        System.out.println(value1);

    }
}