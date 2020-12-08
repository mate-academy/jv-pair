package core.basesyntax;

public class Pair<F> {
    private F first;
    private F second;

    private Pair(F first, F second) {
        this.first = first;
        this.second = second;
    }

    public static <F> Pair of(F first, F second) {
        Pair pair = new Pair(first, second);
        return pair;
    }

    public F getFirst() {
        return first;
    }

    public F getSecond() {
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
        Pair currentPair = (Pair) pair;
        if (pair == null) {
            return false;
        }

        if (((Pair<?>) pair).first == null
                && this.first == null
                && ((Pair<?>) pair).second == null
                && this.second == null) {
            return true;
        }

        if (pair == this) {
            return true;
        }

        if ((((Pair<?>) pair).first == null
                || ((Pair<?>) pair).second == null)
                && this.first == null || this.second == null) {
            return false;
        }

        if (pair.getClass().equals(Pair.class)) {

            return (first.equals(currentPair.first)
                    || (first != null && first.equals(currentPair.first)))
                    && (second.equals((currentPair.second))
                    || (second != null && second.equals(currentPair.second)));
        }
        return false;
    }
}
