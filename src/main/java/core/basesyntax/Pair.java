package core.basesyntax;

class Pair<T, K> {
    private T firstObject;
    private K secondObject;

    private Pair(T firstObject, K secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirst() {
        return firstObject;
    }

    public K getSecond() {
        return secondObject;
    }

    public static <T, K> Pair<T, K> of(T first, K second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, K> pair = (Pair<T, K>) o;
        return (firstObject == pair.firstObject
                || firstObject != null && firstObject.equals(pair.firstObject))
                && (secondObject == pair.secondObject
                || secondObject != null && secondObject.equals(pair.secondObject));
    }

    @Override
    public int hashCode() {
        int hash = 29;
        hash = firstObject == null ? 31 * hash : hash * firstObject.hashCode();
        hash = secondObject == null ? 31 * hash : hash * secondObject.hashCode();
        return hash;
    }
}
