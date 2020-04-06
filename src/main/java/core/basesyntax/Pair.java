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

    public static Pair of(Object first, Object second) {
        return new Pair(first, second);
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
            Pair pair = (Pair) obj;

            return (pair.first == null && first == null) || first.equals(pair.first)
                    && (pair.second == null && second == null) || second.equals(pair.second);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 13;
        hashCode = 31 * hashCode + first.hashCode();
        hashCode = 31 * hashCode + second.hashCode();
        return hashCode;
    }
}
