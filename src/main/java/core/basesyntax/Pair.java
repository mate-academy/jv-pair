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

    public static <T, S> Pair of(T firstItem, S secondItem) {
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
        Pair<T, S> pair = (Pair) obj;
        return (pair.first == first || first != null
                && first.equals(pair.first))
                && (pair.second == second || second != null
                && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 3;
        if (first != null) {
            result = result * 11 + this.first.hashCode();
        }
        if (second != null) {
            result = result * 11 + this.second.hashCode();
        }
        return result;
    }
}
