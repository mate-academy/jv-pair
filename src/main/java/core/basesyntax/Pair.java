package core.basesyntax;

public class Pair<T, V> {
    T first;
    V second;

    public static <T, V> Pair of(T first, V second) {
        return new Pair(first, second);
    }

    @Override
    public int hashCode() {
        int index = 0;
        index = 31 * first.hashCode() * second.hashCode();
        return index;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() == obj.getClass()
                && obj != null) {
            Pair pair = (Pair) obj;
            if (first.equals(pair.getFirst())
                    && second.equals(pair.getSecond())) {
                return true;
            }
        }
        return false;
    }

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
