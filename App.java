import java.util.Objects;

public class App {
    public static void main(String[] args) {
        MultiTypeHashMap<String> map = new MultiTypeHashMap<>();

        map.put("key1", 42);           // ذخیره مقدار Integer
        map.put("key2", "Hello");      // ذخیره مقدار String
        map.put("key3", 3.14);         // ذخیره مقدار Double

        // آزمایش متد get با تایپ‌های مختلف
        Integer intValue = map.get("key1", Integer.class);
        String strValue = map.get("key2", String.class);
        Double doubleValue = map.get("key3", Double.class);
        String invalidValue = map.get("key1", String.class); // باید null بازگرداند

        System.out.println("Integer value: " + intValue);   // خروجی: 42
        System.out.println("String value: " + strValue);     // خروجی: Hello
        System.out.println("Double value: " + doubleValue);  // خروجی: 3.14
        System.out.println("Invalid value: " + invalidValue); // خروجی: null
    }
}
