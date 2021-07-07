package core.basesyntax;

public class Pair<T, K> {
    private static final int CONSTANT = 31;

    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static <T, K> Pair of(T data, K data2) {
        return new Pair<T, K>(data, data2);
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object object) {

        if (null == object) {
            return false;
        }

        if (this == object) {
            return true;
        }

        if (object.getClass().equals(Pair.class)) {
            Pair pair = (Pair<T,K>) object;
            return (pair.first == this.first
                    || (null != pair.first && pair.first.equals(this.first)))
                    &&
                    (pair.second == this.second
                            || (null != pair.second && pair.second.equals(this.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = CONSTANT;
        if (null != first) {
            result += first.hashCode();
        }
        if (null != second) {
            result += second.hashCode();
        }
        return result;
    }
}
