package core.basesyntax;

class Pair<F, S> {
    private final F first;
    private final S second;

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

    public static <F,S> Pair<F,S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public int hashCode() {
        final int prime = 13;
        int result = 17;
        result = prime * result + (first == null ? 0 : first.hashCode());
        result = prime * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null || pair.getClass() != this.getClass()) {
            return false;
        }
        Pair<?, ?> castedPair = (Pair<?, ?>) pair;
        return ((first == castedPair.first)
            || (first != null && first.equals(castedPair.first)))
            && ((second == castedPair.second)
            || (second != null && second.equals(castedPair.second)));
    }
}
