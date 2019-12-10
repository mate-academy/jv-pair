package core.basesyntax;
//
import java.util.Objects;

class Pair<A, B> {
    private A first;
    private B second;

    private Pair(A first, B second) {
        this.first = first;
        this.second = second;
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
        return 31 * first.hashCode() * second.hashCode();
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public static <A, B> Pair of(A first, B second) {
        return new Pair<>(first, second);
    }
}
