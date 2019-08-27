package core.basesyntax;

public class Pair<V, T> {
    private V first;
    private T second;

    private Pair(V first, T second) {
        this.first = first;
        this.second = second;
    }

    public static <V, T> Pair of(V first, T second) {
        return new Pair(first, second);
    }

    public V getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<V, T> pair = (Pair<V, T>) o;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + second.hashCode();
    }


}
