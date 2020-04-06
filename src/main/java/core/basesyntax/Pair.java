package core.basesyntax;

import java.util.Objects;

class Pair<F, S> {
    F parameter1;
    S parameter2;

    public Pair(F parameter1, S parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }

    public F getFirst() {
        return parameter1;
    }

    public S getSecond() {
        return parameter2;
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
        return Objects.equals(parameter1, pair.parameter1)
                && Objects.equals(parameter2, pair.parameter2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter1, parameter2);
    }

    public static <F, S> Pair of(F f, S s) {
        return new Pair(f, s);
    }
}
