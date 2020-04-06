package core.basesyntax;

class Pair<T, E> {
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

    public static <T, E> Pair of(T first, E second) {
        return new Pair(first, second);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair<T, E> pair = (Pair) object;
            return first != null ? (first.equals(pair.first)
                    && second.equals(pair.second)) :
                    (first == pair.first && second == pair.second);
        }
        return false;
    }

    public int hashCode() {
        int result = 31;
        result = 17 * result + (first == null ? 0 : first.hashCode());
        result = 17 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
