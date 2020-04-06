package core.basesyntax;

class Pair <F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair of(K first, V second) {
        return new Pair<>(first, second);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int result = 31;
        if (this.first != null) {
            result = result * 31 * first.hashCode();
        }
        if (this.second != null) {
            result = result * 31 * second.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (pair.getClass().equals(this.getClass())) {
            return (first == pair.getFirst() || first.equals(pair.getFirst()) )
                    && (second == pair.getSecond() || second.equals(pair.getSecond()) );
        }
        return false;
    }
}
