package core.basesyntax;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public static <T1, T2> Pair of(T1 first, T2 second) {

        return new Pair<>(first, second);
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
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
        Pair<T1, T2> pair = (Pair<T1, T2>) object;
        return (first == null && pair.first == null)
                || (first != null && first.equals(pair.first))
                && (second == null && pair.second == null)
                || (second != null && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
