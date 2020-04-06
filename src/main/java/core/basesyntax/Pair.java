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

    K getFirst() {
        return key;
    }

    V getSecond() {
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

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (key != null ? !key.equals(pair.key) : pair.key != null) {
            return false;
        }
        return value != null ? value.equals(pair.value) : pair.value == null;
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
