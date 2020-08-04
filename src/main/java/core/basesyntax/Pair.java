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
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return (firstObject == null && pair.firstObject == null
                || firstObject != null && firstObject.equals(pair.firstObject))
                && (secondObject == null && pair.secondObject == null
                || secondObject != null && secondObject.equals(pair.secondObject));
    }

    @Override
    public int hashCode() {
        int hash = firstObject == null ? 0 : firstObject.hashCode();
        hash = secondObject == null ? 0 : hash * 31 + secondObject.hashCode();
        return hash;
    }
}
