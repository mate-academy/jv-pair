package core.basesyntax;

class Pair<I, S> {
    private I first;
    private S second;

    public static <I, S> Pair of(I first, S second) {
        return new Pair<>(first, second);
    }

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * (first.hashCode() + second.hashCode());
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
