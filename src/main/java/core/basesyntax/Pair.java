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

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<F, S>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Pair<F, S> pair = (Pair<F, S>) object;

        return (first == null || pair.first == null)
                    ? first == pair.first : first.equals(pair.first)
                && (second == null || pair.second == null)
                    ? second == pair.second : second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
