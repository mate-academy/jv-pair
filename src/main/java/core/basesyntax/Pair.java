package core.basesyntax;

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair <>(first, second);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() * second.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ((first == pair.getFirst() || (first != null
                && first.equals(pair.getFirst())))
                && (second == pair.getSecond() || (second != null
                && second.equals(pair.getSecond()))));
    }
}
