package core.basesyntax;

class Pair<T,K> {
    private T firstObject;
    private K secondObject;

    private Pair(T firstObject, K secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public static <T,K> Pair of(T localFirst, K localSecond) {
        return new Pair(localFirst, localSecond);
    }

    public T getFirst() {
        return firstObject;
    }

    public K getSecond() {
        return secondObject;
    }

    @Override
    public int hashCode() {
        return 31 * (firstObject.hashCode() + secondObject.hashCode());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Pair localObject = (Pair)object;
        if (localObject.firstObject.equals(this.firstObject)
                && localObject.secondObject.equals(this.secondObject)) {
            return true;
        }
        return false;
    }
}
