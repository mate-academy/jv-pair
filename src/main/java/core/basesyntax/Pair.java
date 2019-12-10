package core.basesyntax;

public class Pair<T, V> {
    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair of(T first, V second) {
        return new Pair(first, second);
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
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
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Pair pair = (Pair) obj;
        return first.equals(pair.getFirst())
                && second.equals(pair.getSecond());
    }
}
