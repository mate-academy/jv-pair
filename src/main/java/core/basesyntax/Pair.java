package core.basesyntax;

class Pair<T, E> {

    private final T firstObj;
    private final E secondObj;

    public Pair(T firstObj, E secondObj) {
        this.firstObj = firstObj;
        this.secondObj = secondObj;
    }

    public static <T, E> Pair of(T first, E second) {
        return new Pair(first, second);
    }

    public T getFirst() {
        return firstObj;
    }

    public E getSecond() {
        return secondObj;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<T, E> pair = (Pair<T, E>) obj;

        if (firstObj != null ? !firstObj.equals(pair.firstObj) : pair.firstObj != null) {
            return false;
        }
        return secondObj != null ? secondObj.equals(pair.secondObj) : pair.secondObj == null;
    }

    @Override
    public int hashCode() {
        int result = firstObj != null ? firstObj.hashCode() : 0;
        return result = 31 * result + (secondObj != null ? secondObj.hashCode() : 0);
    }
}
