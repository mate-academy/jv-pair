package core.basesyntax;

class Pair<K, N> {
    private K firstElement;
    private N secondElement;

    private Pair(K firstElement, N secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public K getFirst() {
        return firstElement;
    }

    public N getSecond() {
        return secondElement;
    }

    public static <K, N> Pair of(K first, N second) {
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
        Pair pair = (Pair) o;
        return firstElement.equals(pair.firstElement)
                && secondElement.equals(pair.secondElement);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (firstElement != null ? firstElement.hashCode() : 0);
        result = 31 * result + (secondElement != null ? secondElement.hashCode() : 0);
        return result;
    }
}
