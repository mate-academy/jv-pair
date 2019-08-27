package core.basesyntax;

class Pair<T, E> {
    private final T first;
    private final E second;

    private Pair(T t, E e) {
        this.first = t;
        this.second = e;
    }

    public static <T, E> Pair<T, E> of(T t, E e) {
        return new Pair<>(t, e);
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
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
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * (result + ((first == null) ? 0 : first.hashCode()));
        result = prime * (result + ((second == null) ? 0 : second.hashCode()));
        return result;
    }
}
