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
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return compareElements(pair.firstElement, this.firstElement)
                    && compareElements(pair.secondElement, this.secondElement);
        }

        return false;
    }

    private boolean compareElements(Object firstElement, Object secondElement) {
        if (firstElement == null && this.secondElement == null) {
            return true;
        }

        if (firstElement == null || this.secondElement == null) {
            return false;
        }

        return firstElement.equals(secondElement);
    }

    @Override
    public int hashCode() {
        return 31 + 15 * (this.firstElement == null ? 0 : firstElement.hashCode())
                + 8 * (this.secondElement == null ? 0 : secondElement.hashCode());
    }
}
