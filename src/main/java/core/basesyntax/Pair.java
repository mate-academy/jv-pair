package core.basesyntax;

class Pair<T, K> {
    T firstItem;
    K secondItem;

    public T getFirst() {
        return firstItem;
    }

    public K getSecond() {
        return secondItem;
    }

    private Pair(T firstItem, K secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
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

        if (firstItem != null ? !firstItem.equals(pair.firstItem) : pair.firstItem != null) {
            return false;
        }
        return secondItem != null ? secondItem.equals(pair.secondItem) : pair.secondItem == null;
    }

    @Override
    public int hashCode() {
        int result = firstItem != null ? firstItem.hashCode() : 0;
        result = 31 * result + (secondItem != null ? secondItem.hashCode() : 0);
        return result;
    }

    public static Pair of(Object first, Object second) {
        Pair pair = new Pair(first, second);
        return pair;
    }
}
