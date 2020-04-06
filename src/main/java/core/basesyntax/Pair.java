package core.basesyntax;

import java.util.Objects;

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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return (Objects.equals(firstElement, pair.firstElement))
                && (Objects.equals(secondElement, pair.secondElement));
    }

    @Override
    public int hashCode() {
        return 41 * firstElement.hashCode() + secondElement.hashCode();
    }
}
