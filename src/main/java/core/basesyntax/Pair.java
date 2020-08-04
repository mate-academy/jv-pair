package core.basesyntax;

class Pair<T, K> {
    private T item1;
    private K item2;

    private Pair(T item1, K item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getFirst() {
        return item1;
    }

    public K getSecond() {
        return item2;
    }

    public static <T, K> Pair of(T item1, K item2) {
        return new Pair<>(item1, item2);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = getFirst() != null ? 43 * hash + item1.hashCode() : hash;
        hash = getSecond() != null ? 43 * hash + item2.hashCode() : hash;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass().equals(Pair.class)) {
            Pair pair = (Pair) obj;
            return item1 == pair.item1 || (item1 != null && item1.equals(pair.item1))
                    && item2 == pair.item2 || (item2 != null && item2.equals(pair.item2));
        }
        return false;
    }
}
