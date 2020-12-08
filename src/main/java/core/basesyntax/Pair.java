package core.basesyntax;

class Pair<T, S> {
    private T first;
    private S second;

    private Pair(T first, S second) {
        this.first = first;

        this.second = second;
    }

    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj.getClass().equals(Pair.class))) {
            return false;
        }
        Pair<T, S> comparedPair = (Pair<T, S>) obj;
        return ((first == comparedPair.first)
                || (first != null && first.equals(comparedPair.first)))
                && (second == comparedPair.second
                || (second != null && second.equals(comparedPair.second)));
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 23 * hashCode + (first == null ? 0 : first.hashCode());
        hashCode = 23 * hashCode + (second == null ? 0 : second.hashCode());
        return hashCode;
    }

}
