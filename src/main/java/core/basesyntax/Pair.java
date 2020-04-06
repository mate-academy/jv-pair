package core.basesyntax;

class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public static <T1, T2> Pair of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    T1 getFirst() {
        return this.first;
    }

    T2 getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<T1, T2> pair = (Pair) o;
        return compareFirst(pair) && compareSecond(pair);
    }

    private boolean compareFirst(Pair pair) {
        if (first == null && pair.first == null) {
            return true;
        }
        if (first == null || pair.first == null) {
            return false;
        }
        return first.equals(pair.first);
    }

    private boolean compareSecond(Pair pair) {
        if (second == null && pair.second == null) {
            return true;
        }
        if (second == null || pair.second == null) {
            return false;
        }
        return second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int result = 1;
        if (first != null) {
            result = result * 31 + first.hashCode();
        }
        if (second != null) {
            result = result * 31 + second.hashCode();
        }
        return result;
    }
}
