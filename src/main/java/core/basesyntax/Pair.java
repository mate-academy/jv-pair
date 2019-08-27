package core.basesyntax;

import java.util.Objects;

class Pair<T, K> {
    private T typeOne;
    private K typeTwo;

    Pair(T typeOne, K typeTwo) {
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
    }

    public static <T, K> Pair of(T typeOne, K typeTwo) {
        return  new Pair(typeOne, typeTwo);
    }

    public T getFirst() {
        return typeOne;
    }

    public K getSecond() {
        return typeTwo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOne, typeTwo);
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
        return pair.typeOne.equals(this.typeOne)
            && pair.typeTwo.equals(this.typeTwo);
    }
}
