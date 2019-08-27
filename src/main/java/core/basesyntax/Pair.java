package core.basesyntax;

import java.util.Objects;

class Pair<K, V> {
    private K firstArgument;
    private V secondArgument;

    private Pair(K firstArgument, V secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    public static <K, V> Pair<K, V> of(K firstArgument, V secondArgument) {
        return new Pair<>(firstArgument, secondArgument);
    }

    public K getFirst() {
        return firstArgument;
    }

    public V getSecond() {
        return secondArgument;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Pair) {
            Pair<K, V> pairObject = (Pair) object;
            if (this.firstArgument.equals(pairObject.firstArgument)
                    && Objects.equals(this.secondArgument, pairObject.secondArgument)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstArgument, secondArgument);
    }
}
