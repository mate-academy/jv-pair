package core.basesyntax;

class Pair<A, B> {
    private A first;
    private B second;

    private Pair(A first, B second) {
        this.first = first;
        this.second = second;
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

    static <A, B> Pair of(A first, B second) {
        return new Pair<>(first, second);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Pair)) {
            return false;
        }
        Pair<A, B> pair = (Pair<A, B>) object;
        return java.util.Objects.equals(first, pair.getFirst())
                && java.util.Objects.equals(second, pair.getSecond());
    }

    public int hashCode() {
        return java.util.Objects.hash(first, second);
    }
}
