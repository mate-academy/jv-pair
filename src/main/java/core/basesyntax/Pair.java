/*
   Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов
   и не запрещающий элементам принимать значение null.

   Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
   а также статический фабричный метод of(). Конструктор должен быть закрытым (private).

   С корректно реализованным классом Pair должен компилироваться и успешно работать
   следующий код -> Pair.main()
 */

package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair() {
        this.first = null;
        this.second = null;
    }

    private Pair(F first) {
        this.first = first;
        this.second = null;
    }

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    F getFirst() {
        return first;
    }

    S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Pair)) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) object;
        return (first != null ? (first.equals(pair.first)) : pair.first == null)
                && (second != null ? second.equals(pair.second) : pair.second == null);
    }

    @Override
    public int hashCode() {
        int hash = (first != null ? first.hashCode() : 0);
        return 63 * hash + (second != null ? second.hashCode() : 0);
    }

    static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(i); // = 1
        System.out.println(s); // = hello
        System.out.println(mustBeTrue); // = true
        System.out.println(mustAlsoBeTrue); // = true
    }
}
