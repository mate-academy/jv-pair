package core.basesyntax;

class Pair<T, E> {

    private final T firstObject;
    private final E secondObject;

    public Pair(T firstObject, E secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public static <T, E> Pair of(T first, E second) {
        return new Pair(first, second);
    }

    public T getFirst() {
        return firstObject;
    }

    public E getSecond() {
        return secondObject;
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

        if (firstObject != null
                ? !firstObject.equals(pair.firstObject) : pair.firstObject != null) {
            return false;
        }
        return secondObject != null
                ? secondObject.equals(pair.secondObject) : pair.secondObject == null;
    }

    @Override
    public int hashCode() {
        int result = firstObject != null ? firstObject.hashCode() : 0;
        return result = 31 * result + (secondObject != null ? secondObject.hashCode() : 0);
    }
}
