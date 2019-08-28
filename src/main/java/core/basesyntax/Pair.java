package core.basesyntax;

class Pair <A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public static <A, B> Pair of(A first, B second) {
        return new Pair(first, second);
    }
    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public int hashCode() {
        return 31* first.hashCode() + second.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof Pair) {
            Pair<A, B> pair = (Pair<A, B>) object;
            return first.equals(pair.first) && second.equals(pair.second);
        }
        return false;
    }
}

