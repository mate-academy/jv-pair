package core.basesyntax;

class Pair<T, K> {
    private T firstElement;
    private K secondElement;

    private Pair(T first, K second) {
        this.firstElement = first;
        this.secondElement = second;
    }

    public T getFirst() {
        return firstElement;
    }

    public K getSecond() {
        return secondElement;
    }

    public static <T, K> Pair of(T first, K second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Pair) {
            Pair<T, K> pair = (Pair<T, K>) o;
            return this.firstElement.equals(pair.firstElement)
                    && this.secondElement.equals(pair.secondElement);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 41 * firstElement.hashCode() + secondElement.hashCode();
    }
}
