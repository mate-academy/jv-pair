package core.basesyntax;

class Pair<T, V> {
    private T object1;
    private V object2;

    public Pair(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getFirst() {
        return object1;
    }

    public V getSecond() {
        return object2;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }

    public static <T, V> Pair of(T object1, V object2) {
        return new Pair<>(object1, object2);
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
            int inside = (int) object1;
            String string = (String) pair.getSecond();
            if (outside == inside && string.equals(object2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashObject1 = (object1 != null) ? 31 * (int)object1 : 0;
        int hashObject2 = (object2 != null) ? 31 * ((String)object2).length() : 0;
        return hashObject1 + hashObject2;
    }
}
