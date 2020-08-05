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
    public int hashCode() {
        int result = 31;
        result = 17 * result + ((first == null) ? 0 : first.hashCode());
        result = 17 * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Pair.class)) {
            Pair<F, S> pair = (Pair<F, S>) obj;
            return (first == pair.first || first != null && first.equals(pair.first)
                    && second == pair.second || second != null && second.equals(pair.second));
        }
        return false;
    }
}
