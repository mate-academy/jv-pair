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

    public static <I, S> Pair<I,S> of(I first, S second) {
        return new Pair<I,S>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (Pair.class != object.getClass()) {
            return false;
        }
        Pair<I,S> pair = (Pair) object;
        return first == null ? null == pair.first : first.equals(pair.first)
                && second == null ? null == pair.second : second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * result + (first == null ? 0 : first.hashCode());
        result = result * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}

