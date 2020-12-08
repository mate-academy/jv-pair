package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(Object f, Object s) {
        return new Pair(f, s);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass().equals(Pair.class)) {
            return (((Pair<?, ?>) obj).first == null && ((Pair<?, ?>) obj).second == null
                    && first == null && second == null) || (first != null && second != null
                    && first.equals(((Pair<?, ?>) obj).first)
                    && second.equals(((Pair<?, ?>) obj).second));
        }
        return false;
    }
}
