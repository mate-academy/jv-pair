package core.basesyntax;

class Pair<T1, T2> {
    private T1 value1;
    private T2 value2;

    private Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 getFirst() {
        return value1;
    }

    public T2 getSecond() {
        return value2;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        return new Pair(value1, value2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(getClass())) {
            Pair<T1, T2> obj = (Pair<T1, T2>) object;
            return (compareElement(value1, obj.value1)
                    && compareElement(value2, obj.value2));
        }
        return false;
    }

    private boolean compareElement(Object obj1, Object obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        } else {
            return obj1.equals(obj2);
        }
    }

    public int hashCode() {
        int result = 17;
        result = (value1 == null) ? 31 * result : 31 * result + value1.hashCode();
        result = (value2 == null) ? 31 * result : 31 * result + value2.hashCode();
        return result;
    }
}
