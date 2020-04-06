package core.basesyntax;

import java.util.Objects;

class Pair<K, V> {
    private K key;
    private V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) o;
        return Objects.equals(key, ((Pair) o).key)
                && Objects.equals(value, ((Pair) o).value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result *= 31 + key.hashCode();
        result *= 31 + value.hashCode();
        return result;
    }
}
