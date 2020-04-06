package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair() {
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
        if (o.getClass() != Pair.class) {
            return false;
        }
        Pair<F, S> pair = (Pair<F, S>) o;
        return (pair.first == null && first == null)
                || (((pair.first == null) == (first == null))
                && (first.equals(pair.first)
                && (pair.second == null && second == null)
                || (((pair.second == null) == (second == null))
                && second.equals(pair.second))));
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = first != null ? hash * 31 + first.hashCode() : hash;
        hash = second != null ? hash + 31 + second.hashCode() : hash;
        return hash;
    }

    public static <F, S> Pair of(F first, S second) {
        Pair<F, S> obj = new Pair();
        obj.first = first;
        obj.second = second;
        return obj;
    }
}
