package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
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
        int result = 17;
        result *= first == null ? 1 : 31 * first.hashCode();
        result *= second == null ? 1 : 31 * second.hashCode();
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
            return anotherPair.first != null && anotherPair.first.equals(first)
                    && anotherPair.second != null && anotherPair.second.equals(second)
                    || anotherPair.first == null && first == null
                    || anotherPair.second == null && second == null;
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
