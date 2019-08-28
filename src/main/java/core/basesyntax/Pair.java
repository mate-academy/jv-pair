package core.basesyntax;

import java.util.Objects;

class Pair<T, K> {
    private T typeFirst;
    private K typeSecond;

    Pair(T typeFirst, K typeSecond) {
        this.typeFirst = typeFirst;
        this.typeSecond = typeSecond;
    }

    public static <T, K> Pair of(T typeFirst, K typeSecond) {
        return new Pair(typeFirst, typeSecond);
    }

    public T getFirst() {
        return typeFirst;
    }

    public K getSecond() {
        return typeSecond;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFirst, typeSecond);
    }

    @Override
    public boolean equals(Object myObj) {
        if (this == myObj) {
            return true;
        }
        if (myObj == null || getClass() != myObj.getClass()) {
            return false;
        }
        Pair<T, K> pair = (Pair) myObj;
        return pair.typeFirst.equals(this.typeFirst)
                && pair.typeSecond.equals(this.typeSecond);
    }
}
