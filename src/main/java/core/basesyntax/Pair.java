package core.basesyntax;
/*
Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
*/

class Pair<T, TT> {
    private Pair<T, TT> isNull;
    private final T firstElement;
    private final TT secondElement;

    private Pair(T firstElement, TT secondElement) {
        isNull = null;
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public static <T, TT> Pair<T, TT> of(T firstElement, TT secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    public T getFirst() {
        return firstElement;
    }

    public TT getSecond() {
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
            Pair pair = (Pair) obj;
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
