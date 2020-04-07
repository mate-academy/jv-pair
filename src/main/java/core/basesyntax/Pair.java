package core.basesyntax;

class Pair<F, S> {
    private F parameter1;
    private S parameter2;

    private Pair(F parameter1, S parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }

    public static <F, S> Pair of(F f, S s) {
        return new Pair<F, S>(f, s);
    }

    public F getFirst() {
        return parameter1;
    }

    public S getSecond() {
        return parameter2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<F, S> pair = (Pair) o;
        return ((parameter1 == pair.parameter1)
                || (parameter1 != null && parameter1.equals(pair.parameter1)))
                && ((parameter2 == pair.parameter2)
                || (parameter2 != null && parameter2.equals(pair.parameter2)));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = parameter1 == null ? 31 * result : 31 * result + parameter1.hashCode();
        result = parameter2 == null ? 31 * result : 31 * result + parameter2.hashCode();
        return result;
    }
}
