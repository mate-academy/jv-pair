package core.basesyntax;

class Pair<T, F> {

    private T first;
    private F second;

    private Pair(T first, F second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public F getSecond() {
        return this.second;
    }

    public static <T, F> Pair of(Object o1, Object o2) {
        return new Pair(o1, o2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, F> pair = (Pair) o;
        return (first == pair.first || first != null && first.equals(pair.first))
                && (second == pair.second || second != null && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (this.first == null ? 0 : this.first.hashCode());
        result = result * 31 + (this.second == null ? 0 : this.second.hashCode());
        return result;
    }
}
