package core.basesyntax;

import java.util.Objects;

public class Pair<T,S> {
    T firstElement;
    S secondElement;

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
        if (pair != null && this.getClass() == pair.getClass()) {
            Pair<T,S> current = (Pair<T,S>) pair;
            return Objects.equals(this.getFirst(), current.getFirst())
                    && Objects.equals(this.getSecond(), current.getSecond());
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
