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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            Pair pair = (Pair) obj;
            return this.hashCode() == pair.hashCode();
        }
        return false;
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
