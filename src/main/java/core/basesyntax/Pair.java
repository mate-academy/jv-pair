package core.basesyntax;

class Pair<T, K> {
    private T first;
    private K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair<>(first, second);
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
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair rectangle = (Pair) object;
            return first == null ? first == rectangle.first :
                    first.equals(rectangle.first)
                    && second == null ? second == rectangle.second :
                            second.equals(rectangle.second);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
