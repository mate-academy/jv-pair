package core.basesyntax;

class Pair<F,S> {
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
    public boolean equals(Object input) {
        if (this == input) {
            return true;
        }
        if (input == null) {
            return false;
        }
        if (input.getClass().equals(this.getClass())) {
            Pair<F, S> current = (Pair<F, S>) input;
            return (first == current.first || first != null && first.equals(current.first))
                    && (second == current.first || second != null && second.equals(current.second));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 17 * result + (first == null ? 0 : first.hashCode());
        result = 17 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
