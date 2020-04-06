package core.basesyntax;

class Pair<L, R> {
    private L first;
    private R second;

    private Pair(L first, R second) {
        this.first = first;
        this.second = second;
    }

    public L getFirst() {
        return first;
    }

    public R getSecond() {
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
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return compare(first, pair.first) && compare(second, pair.second);
    }

    @Override
    public int hashCode() {
        return (31 * (first == null ? 0 : first.hashCode()))
                + (31 * (second == null ? 0 : second.hashCode()));
    }

    public static <L, R> Pair<L, R> of(L first, R second) {
        return new Pair(first, second);
    }

    public static <L> boolean compare(L first, L second) {
        return (first == null ? second == null : first.equals(second));
    }
}
