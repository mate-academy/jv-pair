package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair<K, V> of(K first, V second) {
        return new Pair(first, second);
    }

    public K getFirst() {
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Pair<K, V> pair = (Pair<K, V>) obj;
        return (this.first == null && pair.first == null ? true :
                this.first != null ? this.first.equals(pair.first) : false)
                &&
                (this.second == null && pair.second == null ? true :
                        this.second != null ? this.second.equals(pair.second) : false);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

}
