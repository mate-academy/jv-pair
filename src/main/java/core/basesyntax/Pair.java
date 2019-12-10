package core.basesyntax;

class Pair<I, S> {
    private I first;
    private S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(I first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null || obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return this.first.equals(pair.first) && this.second.equals(pair.second) ? true : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (first != null) && (second != null) ? 31 * first.hashCode() * second.hashCode() : 0;
    }

    public static Pair of(Object first, Object second) {
        Pair pair = new Pair(first, second);
        return pair;
    }
}
