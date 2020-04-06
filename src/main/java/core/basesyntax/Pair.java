package core.basesyntax;

class Pair<F,S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    static <F, S> Pair of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<F,S> pair = (Pair) o;
        return (first == null ? pair.first == null : first.equals(pair.first))
                && (second == null ? pair.second == null : second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 23 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
