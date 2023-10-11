package core.basesyntax;

class Pair<A, B> {
    private A first;
    private B second;

    private Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public static <A, B> Pair<A, B> of(A first, B second) {
        return new Pair<>(first, second);
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public int hashCode() {
        return 31 * (first == null ? 0 : first.hashCode())
                + 31 * (second == null ? 0 : second.hashCode());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair<A, B> pair = (Pair<A, B>) object;

            return ((first == pair.first) || (first != null && first.equals(pair.first)))
                    && ((second == pair.second) || (second != null && second.equals(pair.second)));
        }
        return false;
    }
}
