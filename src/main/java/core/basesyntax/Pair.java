package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair of(K argument1, V argument2) {
        return new Pair(argument1, argument2);
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int seed = 13;
        seed += (first != null) ? seed * first.hashCode() : 0;
        seed += (second != null) ? seed * second.hashCode() : 0;
        return seed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Pair.class)) {
            Pair current = (Pair) obj;
            return (first == current.getFirst()
                    || (first != null && first.equals(current.getFirst())))
                    && (second == current.getSecond()
                    || (second != null && second.equals(current.getSecond())));
        }
        return false;
    }
}
