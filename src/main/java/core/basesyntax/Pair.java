package core.basesyntax;

public class Pair<I, S> {

    private I first;
    private S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <I, S> Pair of(I first, S second) {
        return new Pair(first, second);
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() == object.getClass()) {
            Pair pair = (Pair) object;
            return ((this.first.equals(pair.getFirst()))
                    && (this.second.equals(pair.getSecond())));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * (first != null ? first.hashCode() : 0);
        hash = hash * (second != null ? second.hashCode() : 0);
        return hash;
    }
}
