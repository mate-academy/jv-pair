package core.basesyntax;

class Pair<T1, T2> {
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
        return this.first;
    }

    public T2 getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T1, T2> pair = (Pair) o;
        return (pair.getFirst() == this.first
                || (pair.getFirst() != null && pair.getFirst().equals(this.first)))
                && (pair.getSecond() == this.second
                || (pair.getSecond() != null && pair.getSecond().equals(this.second)));
    }

    @Override
    public int hashCode() {
        int result = 1;
        if (first != null) {
            result = result * 31 + first.hashCode();
        }
        if (second != null) {
            result = result * 31 + second.hashCode();
        }
        return result;
    }
}
