package core.basesyntax;

import java.util.Objects;

class Pair<Q, W> {

    Q first;
    W second;

    private Pair(Q first, W second) {
        this.first = first;
        this.second = second;
    }

    public static Pair of(Object first, Object second) {
        return new Pair(first, second);
    }

    public Q getFirst() {
        return first;
    }

    public W getSecond() {
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

    @Override
    public String toString() {
        return "Pair{"
                + "first="
                + first
                + ", second="
                + second
                + '}';
    }
}
