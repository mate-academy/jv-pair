package core.basesyntax;

class Pair<T, K> {
    private T number;
    private K string;

    private Pair(T number, K string) {
        this.number = number;
        this.string = string;
    }

    public <T> T getFirst() {
        return (T) number;
    }

    public <K> K getSecond() {
        return (K) string;
    }

    public static <T, K> Pair of(T number, K string) {
        return new Pair<T, K>(number, string);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pair<T, K> pair = (Pair<T, K>) obj;
        return (number == pair.number || number != null && number.equals(pair.number))
                && (string == pair.string || string != null && string.equals(pair.string));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = number == null ? 31 * result : number.hashCode();
        result = string == null ? 31 * result : string.hashCode();
        return result;
    }
}
