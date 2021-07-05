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
        return new Pair<T, K>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, K> pair = (Pair) o;
        return (pair.getFirst() == firstElement
                || (firstElement != null && firstElement.equals(pair.getFirst())))
                && (pair.getSecond() == secondElement
                || (secondElement != null && secondElement.equals(pair.getSecond())));
    }

    @Override
    public int hashCode() {
        int result = 37;
        if (firstElement != null) {
            result = 21 * result + firstElement.hashCode();
        }

        if (secondElement != null) {
            result = 21 * result + secondElement.hashCode();
        }
        return result;
    }
}
