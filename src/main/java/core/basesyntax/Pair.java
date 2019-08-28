package core.basesyntax;

class Pair<T, V> {
    private T firstObject;
    private V secondObject;

    public Pair(T firstObject, V secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirst() {
        return firstObject;
    }

    public V getSecond() {
        return secondObject;
    }

    public void setFirst(T firstObject) {
        this.firstObject = firstObject;
    }

    public void setSecond(V secondObject) {
        this.secondObject = secondObject;
    }

    public static <T, V> Pair of(T firstObject, V secondObject) {
        return new Pair<>(firstObject, secondObject);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Pair) {
            Pair pair = (Pair)object;
            if (!(pair.getFirst() instanceof Integer)) {
                return false;
            }
            if (!(pair.getSecond() instanceof String)) {
                return false;
            }
            int outside = (int) pair.getFirst();
            int inside = (int) firstObject;
            String string = (String) pair.getSecond();
            if (outside == inside && string.equals(secondObject)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashObject1 = (firstObject != null) ? 31 * (int) firstObject : 0;
        int hashObject2 = (secondObject != null) ? 31 * ((String) secondObject).length() : 0;
        return hashObject1 + hashObject2;
    }
}
