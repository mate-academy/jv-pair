package core.basesyntax;

class Pair<T, F> {
    private T first;
    private F second;

    private Pair(T first, F second) {
        this.first = first;
        this.second = second;

    }

    public static <T, F> Pair of(T first, F second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public F getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        Pair<T, F> pair = (Pair) ob;
        return (first == pair.first || first != null && first.equals(pair.first))
                && (second == pair.second || second != null && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? first.hashCode() : 0);

        return result;
    }
}


