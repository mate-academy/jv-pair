package core.basesyntax;

class Pair<T, K> {
    private T firstArgument;
    private K secondArgument;

    private Pair(T fistArgument, K secondArgument) {
        this.firstArgument = fistArgument;
        this.secondArgument = secondArgument;
    }

    public T getFirst() {
        return firstArgument;
    }

    public K getSecond() {
        return secondArgument;
    }

    public static <T, K> Pair<T, K> of(T firstArgument, K secondArgument) {
        return new Pair<>(firstArgument, secondArgument);
    }

    public boolean equals(Pair<T, K> object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass().equals(object.getClass())) {
            Pair<T, K> temp = (Pair<T, K>) object;
            return ((firstArgument == temp.firstArgument)
                    || (firstArgument != null && firstArgument.equals(temp.firstArgument)))
                    && ((secondArgument == temp.secondArgument)
                    || secondArgument != null && secondArgument.equals(temp.secondArgument));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash *= 31 + (secondArgument == null ? 0 : secondArgument.hashCode());
        hash *= 31 + (firstArgument == null ? 0 : firstArgument.hashCode());
        return hash;
    }
}
