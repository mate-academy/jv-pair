package core.basesyntax;

public class Pair<T,K> {
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

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Pair<T,K> pair = (Pair) object;
        return (first == pair.first
                || pair != null && first.equals(pair.first))
                && (second == pair.second
                || pair != null
                && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 23 * result + (first != null ? first.hashCode() : 0);
        result = 23 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

    public static <T,K> Pair of(T first, K second) {
        return new Pair(first,second);
    }
}
