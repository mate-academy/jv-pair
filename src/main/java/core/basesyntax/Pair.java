package core.basesyntax;

class Pair<C, T> {
    private static final int HASHCODE_NUMBER = 31;
    private C first;
    private T second;

    private Pair(C first, T second) {
        this.first = first;
        this.second = second;
    }

    public static <C, T> Pair<C,T> of(C first, T second) {
        return new Pair(first, second);
    }

    public C getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().equals(Pair.class)) {
        return false;
        }
            Pair<?, ?> pair = (Pair<?, ?>) obj;
            return (first != null && first.equals(pair.first) || first == pair.first)
                    && (second != null && second.equals(pair.second) || (second == pair.second));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result *= HASHCODE_NUMBER + (first != null ? first.hashCode() : 0);
        result *= HASHCODE_NUMBER + (second != null ? second.hashCode() : 0);
        return result;
    }
}
