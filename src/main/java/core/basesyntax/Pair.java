package core.basesyntax;

class Pair<T, E> {
    private T firstElement;
    private E secondElement;

    private Pair(T firstElement, E secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public static <T, E> Pair of(T firstElement, E secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    public T getFirst() {
        return firstElement;
    }

    public E getSecond() {
        return secondElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (getClass() == o.getClass()) {
            Pair<T, E> pair = (Pair) o;
            return this.firstElement == pair.firstElement
                    || (this.firstElement != null && this.firstElement.equals(pair.firstElement))
                    || this.secondElement == pair.secondElement
                    || (this.secondElement != null
                    && this.secondElement.equals(pair.secondElement));
        }

        return false;
    }

    @Override
    public int hashCode() {
        return 31 + 15 * (this.firstElement == null ? 0 : firstElement.hashCode())
                + 8 * (this.secondElement == null ? 0 : secondElement.hashCode());
    }
}
