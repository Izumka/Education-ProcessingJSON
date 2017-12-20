package json;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class Tuple<K, V> {
    public final K key;
    public V value;

    public Tuple(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
