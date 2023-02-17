package core.basesyntax;

public class Pair<T,S> {
    private T first;
    private S second;

    private Pair(T first,S second) {
        this.first = first;
        this.second = second;
    }

    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
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
            Pair<S,T> receivedPair = (Pair<S,T>) obj;
            return (first == receivedPair.first || first != null
                    && first.equals(receivedPair.first))
                    && (second == receivedPair.second || second != null
                    && second.equals(receivedPair.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 17 * result + (first == null ? 0 : first.hashCode());
        result = 17 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
