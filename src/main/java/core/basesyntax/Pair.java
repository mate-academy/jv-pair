package core.basesyntax;

class Pair<K, V> {
    private K key;
    private V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair of(K key, V value) {
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<K, V> pair = (Pair) o;
        return key == pair.key || (key != null && key.equals(pair.key))
                && value == pair.value || (value != null
                && value.equals(pair.value));
    }

    @Override
    public int hashCode() {
        int result = 1;
        if (key != null) {
            result *= 31 + key.hashCode();
        }
        if (value != null) {
            result *= 31 + value.hashCode();
        }
        return result;
    }
}
