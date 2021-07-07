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
        Pair<L, R> pair = (Pair) o;
        return (first == pair.first || first != null && first.equals(pair.first))
                && (second == pair.second || second != null && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        return (31 * (first == null ? 0 : first.hashCode()))
                + (31 * (second == null ? 0 : second.hashCode()));
    }

    public static <L, R> Pair of(L first, R second) {
        return new Pair<L, R>(first, second);
    }
}
