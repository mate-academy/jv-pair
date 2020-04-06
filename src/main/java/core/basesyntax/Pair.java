package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (obj.getClass().equals(getClass())) {
            Pair<F, S> pair = (Pair<F, S>) obj;

            return (pair.first == null && first == null) || first.equals(pair.first)
                    && (pair.second == null && second == null) || second.equals(pair.second);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 13;
        hashCode = 31 * hashCode + (first != null ? first.hashCode() : 21);
        hashCode = 31 * hashCode + (second != null ? second.hashCode() : 21);
        return hashCode;
    }
}
