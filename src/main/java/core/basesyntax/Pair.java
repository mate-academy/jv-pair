package core.basesyntax;

class Pair<T, K> {
    private T firstItem;
    private K secondItem;

    private Pair(Object firstItem, Object secondItem) {
        this.firstItem = (T) firstItem;
        this.secondItem = (K) secondItem;
    }

    public Object getFirst() {
        return firstItem;
    }

    public Object getSecond() {
        return secondItem;
    }

    public static <T, K> Pair<T, K> of(Object firstItem, Object secondItem) {
        return new Pair<T, K>(firstItem, secondItem);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair pair = (Pair) object;
            return firstItem == pair.firstItem
                    || firstItem != null && firstItem.equals(pair.firstItem)
                     && secondItem == pair.secondItem
                    || secondItem != null && secondItem.equals(pair.secondItem);
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (firstItem != null && secondItem != null) {
            int result = 17;
            result = 31 * result + firstItem.hashCode();
            result = 31 * result + secondItem.hashCode();
            return result;
        }
        return 0;
    }
}
