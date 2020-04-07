package core.basesyntax;

public class Pair<T, S> {
    T first;
    S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <T, S> Pair of(T first, S second) {
        return new Pair(first, second);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pair<T, S> other = (Pair) obj;

        return (other.getFirst() == this.first
                || (other.getFirst() != null && other.getFirst().equals(this.first)))
                && (other.getSecond() == this.second
                || (other.getSecond() != null && other.getSecond().equals(this.second)));
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 11 * result + (first == null ? 0 : first.hashCode());
        result = 11 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
