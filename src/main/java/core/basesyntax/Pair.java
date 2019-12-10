package core.basesyntax;

import java.util.Objects;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object toCompare) {
        if (this == toCompare) {
            return true;
        }
        if (toCompare == null || this.getClass() != toCompare.getClass()) {
            return false;
        }
        Pair pair = (Pair) toCompare;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hashCode(first) ^ Objects.hashCode(second);
    }
}
