package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair(first, second);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
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
        Pair<F, S> pair = (Pair) o;
        return (first == pair.first || first != null && first.equals(pair.first))
                && (second == pair.second || second != null && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
