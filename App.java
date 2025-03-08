public class App {
    public static void main(String[] args) {
        MultiTypeHashMap<String> map1 = new MultiTypeHashMap<>();
        map1.put("B", "A");
        System.out.println(map1.get(map1));

        String value1 = map1.get("B", String.class);
        System.out.println(value1);

        //------------------------------------------------------------

        MultiTypeHashMap<String> map2 = new MultiTypeHashMap<>();
        map2.put("B", 32);
        System.out.println(map2);

        Integer value2 = map2.get("B", Integer.class);
        System.out.println(value2);

    }
}