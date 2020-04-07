package core.basesyntax;

class Pair<K, V> {
    private K key;
    private V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    public static <K, V> Pair of(Object key, Object value) {
        return new Pair(key, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().equals(obj.getClass())) {
            Pair pair = (Pair) obj;
            return (key == pair.key) || (key != null && key.equals(pair.key))
                    && (value == pair.value) || (value != null && value.equals(pair.value));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n = 17;
        n = 31 * n + (key != null ? key.hashCode() : 0);
        n = 31 * n + (value != null ? key.hashCode() : 0);
        return n;

    }
}

