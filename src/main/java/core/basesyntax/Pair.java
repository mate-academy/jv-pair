package core.basesyntax;

public class Pair<T1, T2> {
    private T1 t1;
    private T2 t2;

    private Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public static <T1, T2> Pair of(T1 t1, T2 t2) {
        return new Pair<>(t1, t2);
    }

    public T1 getFirst() {
        return t1;
    }

    public T2 getSecond() {
        return t2;
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
        return (this.getFirst() == null || pair.getFirst() == null)
                ? this.getFirst() == pair.getFirst()
                : this.getFirst().equals(pair.getFirst())
                && (this.getSecond() == null || pair.getSecond() == null)
                ? this.getSecond() == pair.getSecond()
                : this.getSecond().equals(pair.getSecond());
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result += prime * result + (t1 == null ? 0 : t1.hashCode());
        result += prime * result + (t2 == null ? 0 : t2.hashCode());
        return result;
    }
}
