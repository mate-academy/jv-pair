package core.basesyntax;

/*реализуйте generic-класс Pair, содержащий пару элементов разных
типов и не запрещающий элементам принимать значение null.
Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
а также статический фабричный метод of().
Конструктор должен быть закрытым (private).
С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:*/

class Pair<A, N> {
    private A age;
    private N name;

    private Pair(A age, N name) {
        this.age = age;
        this.name = name;
    }

    public static <A, N> Pair of(A age, N name) {
        return new Pair(age, name);
    }

    public A getFirst() {
        return age;
    }

    public N getSecond() {
        return name;
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
        return (age == pair.age || age != null && age.equals(pair.age))
                && (name == pair.name || name != null && name.equals(pair.name));
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
