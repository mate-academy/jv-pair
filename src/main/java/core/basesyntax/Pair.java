package core.basesyntax;

import java.util.Objects;

class Pair<F, S> {
    F first;
    S second;

    public Pair(F firstObject, S secondObject) {
        this.first = firstObject;
        this.second = secondObject;
    }

    public static <F, S> Pair<F, S> of(F firstObject, S secondObject) {
        return new Pair<>(firstObject, secondObject);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    public boolean equals(Object pair) {
        if (pair == this) {
            return true;
        }
        if (pair == null) {
            return false;
        }
        if (!pair.getClass().equals(getClass())) {
            return false;
        }
        Pair<F, S> current = (Pair<F, S>) pair;
        return Objects.equals(first, current.first) && Objects.equals(second, current.second);
    }
}
