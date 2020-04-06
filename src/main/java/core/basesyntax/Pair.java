package core.basesyntax;

import java.util.Objects;

class Pair<T, S> {
    private T firstItem;
    private S secondItem;

    public Pair(T firstItem, S secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirst() {
        return firstItem;
    }

    public S getSecond() {
        return secondItem;
    }

    public static <T, S> Pair of(T firstItem, S secondItem) {
        return new Pair<>(firstItem,secondItem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        Pair<T, S> test = (Pair) o;
        return Objects.equals(firstItem,test.firstItem)
                    && Objects.equals(secondItem,test.secondItem);
    }

    @Override
    public int hashCode() {
        int result = 17;
        int magicNumber = 31;
        result = firstItem == null ? result * magicNumber
                : firstItem.hashCode();
        result = secondItem == null ? result * magicNumber
                : secondItem.hashCode();
        return result;

    }
}
