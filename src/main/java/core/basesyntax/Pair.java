package core.basesyntax;

class Pair<I, S> {
    private I first;
    private S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(I first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public static <I, S> Pair of(I data, S data2) {
        return new Pair<I, S>(data, data2);
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

        if (first != null ? !first.equals(pair.first) : pair.first != null) {
            return false;
        }
        return second != null ? second.equals(pair.second) : pair.second == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
