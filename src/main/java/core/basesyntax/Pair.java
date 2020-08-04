package core.basesyntax;

public class Pair<T1, T2> {
    private final T1 firstVariable;
    private final T2 secondVariable;

    private Pair(T1 firstVariable, T2 secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 firstVariable, T2 secondVariable) {
        return new Pair<>(firstVariable, secondVariable);
    }

    public T1 getFirst() {
        return firstVariable;
    }

    public T2 getSecond() {
        return secondVariable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair<T1, T2> pair = (Pair<T1, T2>) o;
        return (this.firstVariable == null || pair.firstVariable == null)
                ? this.firstVariable == pair.firstVariable
                : this.firstVariable.equals(pair.firstVariable)
                && (this.secondVariable == null || pair.secondVariable == null)
                ? this.secondVariable == pair.secondVariable
                : this.secondVariable.equals(pair.secondVariable);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result += prime * result + (firstVariable == null ? 0 : firstVariable.hashCode());
        result += prime * result + (secondVariable == null ? 0 : secondVariable.hashCode());
        return result;
    }
}
