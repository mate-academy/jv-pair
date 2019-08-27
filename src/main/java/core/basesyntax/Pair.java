package core.basesyntax;

class Pair<F, S> {
    F first;
    S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair<F, S>(first, second);
    }

    public F getFirst() {
        return this.first;
    }

    public void setFirst(final F first) {
        this.first = first;
    }

    public S getSecond() {
        return this.second;
    }

    public void setSecond(final S second) {
        this.second = second;
    }

    @Override
    public int hashCode() {
        return first.hashCode() << 16 & second.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair<F, S> pair = (Pair) obj;
            return pair.getFirst().equals(this.first)
                    && pair.getSecond().equals(this.second);
        }
        return false;
    }
}
