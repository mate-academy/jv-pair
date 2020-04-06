package core.basesyntax;

class Pair<T, S> {
    private T firstObject;
    private S secondObject;

    private Pair(T firstObject, S secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    static <T, S> Pair of(T firstObject, S secondObject) {
        return new Pair<>(firstObject, secondObject);
    }

    T getFirst() {
        return firstObject;
    }

    S getSecond() {
        return secondObject;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass() == Pair.class) {
            Pair pair = (Pair) object;
            return (this.firstObject == null && pair.firstObject == null)
                    && (this.secondObject == null && pair.secondObject == null)
                    || this.firstObject.equals(pair.firstObject)
                    && this.secondObject.equals(pair.secondObject);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 13;
        if (this.firstObject != null) {
            result *= 37 + firstObject.hashCode();
        }
        if (this.secondObject != null) {
            result *= 37 + secondObject.hashCode();
        }
        return result;
    }
}
