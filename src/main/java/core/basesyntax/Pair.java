package core.basesyntax;

class Pair<T, K> {
    private T temp;
    private K key;

    private Pair(T temp, K key) {
        this.temp = temp;
        this.key = key;
    }

    public static <T, K> Pair of(T temp, K key) {
        return new Pair<>(temp, key);
    }

    public T getFirst() {
        T objectFirst = temp;
        return objectFirst;
    }

    public K getSecond() {
        K objectSecond = key;
        return objectSecond;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (temp != null) {
            result = prime * result + temp.hashCode();
        }
        if (key != null) {
            result = prime * result + key.hashCode();
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Pair.class)) {
            Pair pair = (Pair<T,K>) obj;
            return temp != null ? temp.equals(pair.temp)
                    : pair.temp == null
                    && key != null ? key.equals(pair.key)
                    : pair.key == null;
        }
        return false;
    }
}
