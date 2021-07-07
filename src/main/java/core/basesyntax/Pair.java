package core.basesyntax;

class Pair<T, S> {

    private T first;
    private S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <T, S> Pair of(T first, S second) {
        return new Pair(first, second);
    }

    public T getFirst() {
        return first;

    }

    public S getSecond() {
        return second;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Pair<T, S> pair = (Pair) obj;
        return ((pair.first == null && first == null)
                || (first != null && first.equals(pair.first)))
                && ((pair.second == null && second == null)
                || (second != null && second.equals(pair.second)));
    }

    @Override
    public int hashCode() {
        int primary = 43;
        int result = primary + (first == null ? 0 : first.hashCode());
        result = result * primary + (second == null ? 0 : second.hashCode());
        return result;
    }
}
