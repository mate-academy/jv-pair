package core.basesyntax;

class Pair<X, Y> {
    private X first;
    private Y second;

    private Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public static <X, Y> Pair of(X first, Y second) {
        return new Pair<>(first, second);
    }

    public X getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        return 31 * ((first != null) ? first.hashCode() : 0)
                + ((second != null) ? second.hashCode() : 0);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Pair pair = (Pair) object;
        return this.first.equals(pair.first)
                && this.second.equals(pair.second);
    }
}
