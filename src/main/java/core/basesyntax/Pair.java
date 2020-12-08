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

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 17 * result + (key == null ? 0 : key.hashCode());
        result = 11 * result + (value == null ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair<K, V> pair = (Pair<K, V>) object;
            return (key == pair.getFirst() || (key != null && key.equals(pair.getFirst())))
                    && (value == pair.getSecond()
                    || (value != null && value.equals(pair.getSecond())));
        }
        return false;
    }
}
