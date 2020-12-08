package core.basesyntax;

class Pair<T, Y> {
    private T first;
    private Y second;

    private Pair(T first, Y second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public Y getSecond() {
        return second;
    }

    public void setSecond(Y second) {
        this.second = second;
    }

    public static <T, Y> Pair<T, Y> of(T first, Y second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == this) {
            return true;
        }

        if (pair == null) {
            return false;
        }
        if (pair.getClass().equals(getClass())) {
            Pair<T, Y> newPair = (Pair<T, Y>) pair;
            return (first == newPair.first
                    || (first != null && first.equals(newPair.first)))
                    && (second == newPair.second
                    || (second != null && second.equals(newPair.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int individualHashCode = 113;
        individualHashCode = 47 * individualHashCode + (first == null ? 0 : first.hashCode());
        individualHashCode = 47 * individualHashCode + (second == null ? 0 : second.hashCode());
        return individualHashCode;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> secondPair = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(secondPair); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == secondPair.hashCode();
    }

}
