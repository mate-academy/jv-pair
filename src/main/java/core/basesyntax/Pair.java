package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair<?, ?> current = (Pair<?, ?>) pair;
            return ((first == current.first)
                    || (first != null && first.equals(current.first)))
                    && ((second == current.second)
                    || (second != null && second.equals(current.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        if (first == null) {
            throw new RuntimeException("Parameter is null");
        }
        this.first = first;
    }

    public void setSecond(S second) {
        if (second == null) {
            throw new RuntimeException("Parameter is null");
        }
        this.second = second;
    }
}
