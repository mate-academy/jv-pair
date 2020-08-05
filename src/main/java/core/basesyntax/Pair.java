package core.basesyntax;

public class Pair<T, S> {
    private T firstItem;
    private S secondItem;

    private Pair(T firstItem, S secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirst() {
        return (T) firstItem;
    }

    public S getSecond() {
        return (S) secondItem;
    }

    public static <T1, T2> Pair of(T1 item1, T2 item2) {
        return new Pair<>(item1, item2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !o.getClass().equals(o.getClass())) {
            return false;
        }
        Pair<T, S> pair = (Pair<T, S>) o;
        return firstItem != null ? firstItem.equals(pair.getFirst()) : firstItem == pair.getFirst()
                && firstItem != null ? secondItem.equals(pair.getSecond()) : secondItem == pair.getSecond();
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + (firstItem == null ? 0 : firstItem.hashCode());
        hash = hash * 31 + (secondItem == null ? 0 : secondItem.hashCode());
        return hash;
    }
}
