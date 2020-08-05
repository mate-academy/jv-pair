package core.basesyntax;

public class Pair<F, S> {
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

    public static <K, V> Pair of(K first, V second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != obj.getClass()) {
            return false;
        }
        Pair<F, S> pair = (Pair) obj;
        return first == null ? first == pair.first : first.equals(pair.first)
                && second == null ? second == pair.second : second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result * (first == null ? 0 : first.hashCode());
        result = 31 * result * (second == null ? 0 : second.hashCode());
        return result;
    }
}
