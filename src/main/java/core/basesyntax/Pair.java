package core.basesyntax;

class Pair<K, T> {
    private K value1;
    private T value2;

    private Pair(K value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public K getFirst() {
        return value1;
    }

    public T getSecond() {
        return value2;
    }

    static <K, T> Pair of(K value1, T value2) {
        return new Pair(value1, value2);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + (value1 == null ? 0 : value1.hashCode());
        result = prime * result + (value2 == null ? 0 : value2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(Pair.class)) {
            return false;
        }
        Pair objCast = (Pair) obj;
        return (value1 != null ? value1.equals(objCast.value1) : value1 == objCast.value1)
                && (value2 != null ? value2.equals(objCast.value2) : value2 == objCast.value2);
    }
}
