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

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
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
}
