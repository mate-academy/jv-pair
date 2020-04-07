package core.basesyntax;

class Pair<T, S> {
    private T first;
    private S second;

    private Pair(T firstItem, S secondItem) {
        this.first = firstItem;
        this.second = secondItem;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    static <T, S> Pair of(T firstItem, S secondItem) {
        return new Pair(firstItem, secondItem);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        if ((this.first == null ^ ((Pair<T, S>) obj).first == null)
                || (this.second == null ^ ((Pair<T, S>) obj).second == null)) {
            return false;
        }
        return ((((Pair<T, S>) obj).first == this.first)
                || this.first.equals(((Pair<T, S>) obj).first))
                && ((((Pair<T, S>) obj).second == this.second)
                || this.second.equals(((Pair<T, S>) obj).second));

    }

    @Override
    public int hashCode() {
        int result = 3;
        if (this.getFirst() != null) {
            result = result * 11 + this.first.hashCode();
        }
        if (this.getSecond() != null) {
            result = result * 11 + this.second.hashCode();
        }
        return result;
    }
}
