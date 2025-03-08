import java.util.HashMap;

public class MultiTypeHashMap<K> extends HashMap<K, Object> {


    public <T> T get(K key, Class<T> valueType) {//this method try to convert a value to a <T>
        Object value = super.get(key);

        if (value == null) {
            return null;
        }
        if (!valueType.isInstance(value)) {
            return null;
        }

        return valueType.cast(value);
    }

}
