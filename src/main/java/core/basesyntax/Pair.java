package core.basesyntax;

class Pair<E,T> {
    private E first;
    private T second;

    private Pair(E first, T second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object element) {
        if (this == element) {
            return true;
        }
        if (element == null || getClass() != element.getClass()) {
            return false;
        }
        Pair pair = (Pair<E, T>) element;
        return (first != null ? first.equals(pair.first) : pair.first == null)
                && (second != null ? second.equals(pair.second) : pair.second == null);
    }

    @Override
    public int hashCode() {
        int prime = 47;
        int code = first == null ? prime : prime * first.hashCode();
        code = second == null ? code : prime * code + second.hashCode();
        return code;
    }

    public static <E, T> Pair of(E first, T second) {
        return new Pair(first, second);
    }
}
