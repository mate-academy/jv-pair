package core.basesyntax;

/*реализуйте generic-класс Pair, содержащий пару элементов разных
типов и не запрещающий элементам принимать значение null.
Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
а также статический фабричный метод of().
Конструктор должен быть закрытым (private).
С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:*/

class Pair<S, U> {
    private S first;
    private U second;

    private Pair(S first, U second) {
        this.first = first;
        this.second = second;
    }

    public static <S, U> Pair of(S first, U second) {
        return new Pair(first, second);
    }

    public S getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return (first == pair.first || first != null && first.equals(pair.first))
                && (second == pair.second || second != null && second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
