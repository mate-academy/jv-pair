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
    private T object1;
    private V object2;

    private Pair(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return object1;
    }

    public V getObject2() {
        return object2;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }

    public static <T, V> Pair of(T t, V v) {
        return new Pair(t, v);
    }

    public T getFirst() {
        return object1;
    }

    public V getSecond() {
        return object2;
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
        return this.object1.equals(pair.object1)
                && this.object2.equals(pair.object2);
    }

    @Override
    public int hashCode() {
        return object1.hashCode() * 31 + object2.hashCode();
    }
}
