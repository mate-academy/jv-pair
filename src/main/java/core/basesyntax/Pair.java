package core.basesyntax;

class Pair<T, S> {
    private T integer;
    private S string;

    private Pair(T integer, S string) {
        this.integer = integer;
        this.string = string;
    }

    public static <T, S> Pair<T, S> of(T integer, S string) {
        return new Pair<>(integer, string);
    }

    public T getFirst() {
        return integer;
    }

    public S getSecond() {
        return string;
    }

    public T getInteger() {
        return integer;
    }

    public void setInteger(T integer) {
        this.integer = integer;
    }

    public S getString() {
        return string;
    }

    public void setString(S string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj.getClass().equals(Pair.class))) {
            return false;
        }
        Pair<T, S> comparedPair = (Pair<T, S>) obj;
        return ((integer == comparedPair.integer)
                || (integer != null && integer.equals(comparedPair.integer)))
                && (string == comparedPair.string
                || (string != null && string.equals(comparedPair.string)));
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 23 * hashCode + (integer == null ? 0 : integer.hashCode());
        hashCode = 23 * hashCode + (string == null ? 0 : string.hashCode());
        return hashCode;
    }

}
