package core.basesyntax;

class Pair<T,A> {
    private T one;
    private A two;

    private Pair(T one, A two) {
        this.one = one;
        this.two = two;
    }

    public T getFirst() {
        return one;
    }

    public A getSecond() {
        return two;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }
        if (o.getClass().equals(getClass())) {
            Pair<T, A> pair = (Pair) o;
            if (pair.one == null && one == null && pair.two == null && two == null) {
                return true;
            }
            assert one != null;
            return one.equals(pair.one) && two.equals(pair.two);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 + (31 * (one == null
                ? 0 : one.hashCode())) + (27 * (two == null ? 0 : two.hashCode()));
    }

    public static <T,A> Pair of(T one, A two) {
        Pair<T,A> x = new Pair<T,A>(one, two);
        return x;
    }
}
