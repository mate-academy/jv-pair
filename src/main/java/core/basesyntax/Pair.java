package core.basesyntax;

public class Pair<T,S> {
    private T firstElement;
    private S secondElement;

    private Pair(T firstElement, S secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirst() {
        return firstElement;
    }

    public S getSecond() {
        return secondElement;
    }

    public static <T,S> Pair<T,S> of(T firstElement, S secondElement) {
        return new Pair<T,S>(firstElement,secondElement);
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (getClass() == pair.getClass()) {
            Pair<T,S> current = (Pair<T,S>) pair;
            return ((firstElement == current.firstElement
                    || firstElement != null && firstElement.equals(current.firstElement)))
                    && ((secondElement == current.secondElement
                    || secondElement != null && secondElement.equals(current.secondElement)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int prime = 17;
        prime = 31 * prime + (firstElement == null ? 0 : firstElement.hashCode());
        prime = 31 * prime + (secondElement == null ? 0 : secondElement.hashCode());
        return prime;
    }
}
