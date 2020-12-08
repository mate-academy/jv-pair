package core.basesyntax;

public class Pair<T, E> {
    private T first;
    private E second;

    private Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public static <T, E> Pair<T, E> of(T first, E second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass().equals(object.getClass())) {

            Pair<?, ?> pair = (Pair<?, ?>) object;
            return ((this.first == pair.first
                || this.first != null && this.first.equals(pair.first)))
                && ((this.second == pair.second
                || this.second != null && this.second.equals(pair.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 43;
        result = 53 * result + (first == null ? 0 : first.hashCode());
        result = 53 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
