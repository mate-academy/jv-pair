package core.basesyntax;

class Pair<T, S> {
    private T type1;
    private S type2;

    private Pair(T type1, S type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public T getFirst() {
        return type1;
    }

    public S getSecond() {
        return type2;
    }

    public static <T, S> Pair of(T type1, S type2) {
        return new Pair<>(type1, type2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, S> pair = (Pair) o;
        return type1 == null ? pair.type1 == null
                : (type1.equals(pair.type1))
                && type2 == null ? pair.type2 == null
                : (type2.equals(pair.type2));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result *= 31 + (type1 == null ? 0 : type1.hashCode());
        result *= 31 + (type2 == null ? 0 : type2.hashCode());
        return result;
    }
}
