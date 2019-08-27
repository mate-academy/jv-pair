package core.basesyntax;

import java.util.Objects;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair(first, second);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first)
                && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
