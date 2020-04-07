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
        if (firstObject != null && secondObject != null) {
            return firstObject.equals(pair.firstObject) && secondObject.equals(pair.secondObject);
        } else if (firstObject == null && pair.firstObject == null && secondObject != null) {
            return secondObject.equals(pair.secondObject);
        } else if (secondObject == null && pair.secondObject == null && firstObject != null) {
            return firstObject.equals(pair.firstObject);
        } else {
            return secondObject == null && pair.secondObject == null
                    && firstObject == null
                    && pair.firstObject == null;
        }
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 13 * result * firstObject.hashCode();
        result = 13 * result * secondObject.hashCode();
        return result;
    }
}
