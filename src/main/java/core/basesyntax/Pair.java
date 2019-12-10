package core.basesyntax;

class Pair<T, S> {
    private T firsItem;
    private S secondItem;

    private Pair(T firsItem, S secondItem) {
        this.firsItem = firsItem;
        this.secondItem = secondItem;
    }

    public T getFirsItem() {
        return firsItem;
    }

    public S getSecondItem() {
        return secondItem;
    }

    public T getFirst() {
        return firsItem;
    }

    public S getSecond() {
        return secondItem;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        return this.firsItem.equals(pair.firsItem) && this.secondItem.equals(pair.secondItem);
    }

    @Override
    public int hashCode() {
        int resualt = 31;
        resualt = resualt + (firsItem == null ? 0 : firsItem.hashCode());
        resualt = resualt + (secondItem == null ? 0 : secondItem.hashCode());
        return resualt;
    }

    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair(first, second);
    }
}

