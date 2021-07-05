package core.basesyntax;
/*
Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
*/

class Pair<T, K> {
    private T firstElement;
    private K secondElement;

    private Pair(T firstElement, K secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public static <T, K> Pair<T, K> of(T firstElement, K secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    public T getFirst() {
        return firstElement;
    }

    public K getSecond() {
        return secondElement;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Pair.class)) {
            Pair<T, K> pair = (Pair<T, K>) obj;
            return firstElement == null
                    ? firstElement == pair.firstElement
                    : firstElement.equals(pair.firstElement)
                    && secondElement == null
                    ? secondElement == pair.secondElement
                    : secondElement.equals(pair.secondElement);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int res = 7;
        res += firstElement == null ? 0 : firstElement.hashCode();
        res += secondElement == null ? 0 : secondElement.hashCode();
        return res;
    }
}
