import java.util.HashMap;

public class MultiTypeHashMap<K> extends HashMap<K, Object> {


    public <T> T get(K key, Class<T> valueType){
        Object value = super.get(key);

        if(value == null || valueType.isInstance(value)){
            return null;
        }

        return valueType.cast(value);
    }

}
