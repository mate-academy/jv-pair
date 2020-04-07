package core.basesyntax;

class Pair<K, V> {
    private K value1;
    private V value2;

    private Pair(K value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public K getFirst() {
        return value1;
    }

    public V getSecond() {
        return value2;
    }

    public static <K, V> Pair of(K value1, V value2) {
        return new Pair<K, V>(value1, value2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(getClass())) {
            Pair<K, V> obj = (Pair) object;
            return (compareElement(this, obj));
        }
        return false;
    }

    private boolean compareElement(Pair<K, V> obj1, Pair<K, V> obj2) {
        return (obj1.value1 == obj2.value1
                || (obj1.value1 != null && obj1.value1.equals(obj2.value1)))
                && (obj1.value2 == obj2.value2
                || (obj1.value2 != null && obj1.value2.equals(obj2.value2)));
    }

    public int hashCode() {
        int result = 17;
        result = (value1 == null) ? 31 * result : 31 * result + value1.hashCode();
        result = (value2 == null) ? 31 * result : 31 * result + value2.hashCode();
        return result;
    }
}
