package core.basesyntax;

class Pair<K, V> {
    private K key;
    private V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    static <K, V> Pair of(K key, V value) {
        return new Pair(key, value);
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

        return (pair.value == value || (value != null && value.equals(pair.value)))
                && (pair.key == key || (key != null && key.equals(pair.key)));
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (key != null) {
            result = 19 * result + key.hashCode();
        }
        if (value != null) {
            result = 23 * result + value.hashCode();
        }
        return result;
    }
}
