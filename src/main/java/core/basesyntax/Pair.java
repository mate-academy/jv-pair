package core.basesyntax;

/*
Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов
разных типов и не запрещающий элементам принимать значение null.

Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический
фабричный метод of(). Конструктор должен быть закрытым (private).

С корректно реализованным классом Pair должен компилироваться
и успешно работать следующий код:

Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); // 1
String s = pair.getSecond(); // "hello"

Pair<Integer, String> pair2 = Pair.of(1, "hello");
boolean mustBeTrue = pair.equals(pair2); // true!
boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
 */
class Pair<T, V> {
    private T objectOne;
    private V objectTwo;

    private Pair(T objectOne, V objectTwo) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
    }

    public T getObjectOne() {
        return objectOne;
    }

    public V getObjectTwo() {
        return objectTwo;
    }

    public void setObjectOne(T objectOne) {
        this.objectOne = objectOne;
    }

    public void setObjectTwo(V objectTwo) {
        this.objectTwo = objectTwo;
    }

    public static <T, V> Pair of(T objectOne, V objectTwo) {
        return new Pair(objectOne, objectTwo);
    }

    public T getFirst() {
        return objectOne;
    }

    public V getSecond() {
        return objectTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T, V> pair = (Pair<T, V>) o;
        return this.objectOne.equals(pair.objectOne)
                && this.objectTwo.equals(pair.objectTwo);
    }

    @Override
    public int hashCode() {
        return objectOne.hashCode() * 31 + objectTwo.hashCode();
    }
}
