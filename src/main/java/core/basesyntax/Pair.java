package core.basesyntax;

class Pair <I, S> {
    private I first;
    private S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    static <I, S> Pair<I, S> of(I first, S second) {
        return new Pair<>(first, second);
    }

    public I getFirst() {
        return first;
    }

    public void setFirst(I first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
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

        Pair<?, ?> pair = (Pair<?, ?>) o;
        return (first == pair.first || (first != null && first.equals(pair.first)))
                && (second == pair.second || (second != null && second.equals(pair.second)));
    }

    @Override
    public int hashCode() {
        int result = 11;
        result *= 31 + (first == null ? 0 : first.hashCode());
        result *= 31 + (second == null ? 0 : second.hashCode());
        return result;
    }
}
