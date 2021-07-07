package core.basesyntax;

class Pair<T, S> {
    private T firstObject;
    private S secondObject;

    private Pair(T firstObject, S secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirst() {
        return firstObject;
    }

    public S getSecond() {
        return secondObject;
    }

    public static <T, S> Pair of(T firstObject, S secondObject) {
        return new Pair<T, S>(firstObject, secondObject);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, S> pair = (Pair<T, S>) o;

        return (firstObject == pair.firstObject
                || (firstObject != null && firstObject.equals(pair.firstObject)))
                && (secondObject == pair.secondObject
                || (secondObject != null && secondObject.equals(secondObject)));
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 13 * result + (firstObject != null ? firstObject.hashCode() : 0);
        result = 13 * result + (secondObject != null ? secondObject.hashCode() : 0);
        return result;
    }
}
