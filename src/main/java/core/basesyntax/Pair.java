package core.basesyntax;

public class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        Pair pair = new Pair(first, second);
        return pair;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31 * res + (first == null ? 0 : first.hashCode());
        res = 31 * res + (second == null ? 0 : second.hashCode());
        return res;
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == null) {
            return false;
        }

        if (pair == this) {
            return true;
        }

        if (pair.getClass().equals(getClass())) {
            Pair<F, S> currentPair = (Pair<F, S>) pair;
            return ((first == currentPair.first
                    || (first != null && first.equals(currentPair.first)))
                    && (second == currentPair.second
                    || (second != null && second.equals(currentPair.second))));
        }
        return false;
    }
}
