package core.basesyntax;

class Pair<T1, T2> {
    T1 first;
    T2 second;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
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

        Pair<T1, T2> pair = (Pair<T1, T2>) o;

        if (first != null ? !first.equals(pair.first) : pair.first != null) {
            return false;
        }
        return second != null ? second.equals(pair.second) : pair.second == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

    public static <T1, T2> Pair of(T1 first, T2 second) {
        return new Pair(first, second);
    }
}
