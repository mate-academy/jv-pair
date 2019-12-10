package core.basesyntax;

class Pair<T, K> {
    private T firstElement;
    private K secondElement;

    private Pair(T first, K second) {
        firstElement = first;
        secondElement = second;
    }

    public static <T, K> Pair of(T t, K k) {
        return new Pair(t, k);
    }

    public T getFirst() {
        return firstElement;
    }

    public K getSecond() {
        return secondElement;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Pair obj = (Pair) object;
        if (firstElement == obj.getFirst()) {
            return secondElement.equals(obj.getSecond());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * getFirst().hashCode() + (31 * getSecond().hashCode());
    }
}
