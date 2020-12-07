package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair(first, second);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result += getFirst() == null ? 0 : 31 * getFirst().hashCode();
        result *= getSecond() == null ? 1 : 31 * getSecond().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == this) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair<F, S> anotherPair = (Pair<F, S>) pair;
            return anotherPair.first != null && anotherPair.first.equals(this.first)
                    && anotherPair.second != null && anotherPair.second.equals(this.second)
                    || anotherPair.first == null && this.first == null
                    || anotherPair.second == null && this.second == null;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pair{"
                + "first=" + first
                + ", second=" + second + '}';
    }
}
