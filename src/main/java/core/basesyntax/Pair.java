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

    static <T, K> Pair of(T first, K second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair<T, K> pair = (Pair<T, K>) obj;
        return first == null ? pair.first == null : first.equals(pair.first)
                && second == null ? pair.second == null : second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result *= 31;
        if (first != null) {
            result += first.hashCode();
        }
        result *= 31;
        if (second != null) {
            result += second.hashCode();
        }
        return result;
    }
}
