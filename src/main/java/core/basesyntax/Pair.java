package core.basesyntax;

import java.util.Objects;

class Pair<T, F> {

    private T first;
    private F second;

    private Pair(T first, F second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public F getSecond() {
        return second;
    }

    public static Pair of(Object o1, Object o2) {
        return new Pair(o1, o2);
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
        Object[] a = {this.first, this.second};
        if (a == null) {
            return 0;
        } else {
            int result = 1;
            Object[] var2 = a;
            int var3 = a.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                Object element = var2[var4];
                result = 31 * result + (element == null ? 0 : element.hashCode());
            }
            return result;
        }
    }
}


