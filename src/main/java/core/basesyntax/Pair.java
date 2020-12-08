package core.basesyntax;

class Pair<K, V> {
    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K,V> Pair<K,V> of(K firstElement, V secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    public K getFirst() {
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object element) {
        if (element == this) {
            return true;
        }
        if (element == null) {
            return false;
        }
        if (element.getClass().equals(Pair.class)) {
            Pair<K,V> firstElement = (Pair<K,V>) element;
            return ((first == firstElement.first
                    || (first != null && first.equals(firstElement.first)))
                    && (second == firstElement.second
                    || (second != null && second.equals(firstElement.second))));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = result + (first == null ? 0 : first.hashCode());
        result = result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
