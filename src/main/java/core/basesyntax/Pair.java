package core.basesyntax;

class Pair<K, V> {
    private K key;
    private V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair of(K key, V value) {
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
        Pair<K, V> pair = (Pair<K, V>) o;
        return (((key != null && key.equals(pair.getFirst())) || key == pair.getFirst())
                && (value != null && value.equals(pair.getSecond())) || value == pair.getSecond());
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode() * 31)
                + (value == null ? 0 : value.hashCode() * 31);
    }
}
