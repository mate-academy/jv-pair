package core.basesyntax;

public class Pair<T, T1> {
    T first;
    T1 second;

    public static Pair<Integer, String> of(int i, String hello) {
        return new Pair<>(i, hello);
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
            if (this.getFirst().equals(pair.getFirst())
                    && this.getSecond().equals(pair.getSecond())) {
                return true;
            }
        }
        return false;
    }

    private Pair(T first, T1 second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T1 getSecond() {
        return second;
    }
}
