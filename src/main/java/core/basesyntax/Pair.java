package core.basesyntax;

class Pair<T, G> {
    private T first;
    private G second;

    private Pair(T first, G second) {
        this.first = first;
        this.second = second;
    }

    public static <T, G> Pair of(T first, G second) {
        return new Pair<>(first, second);
    }

    T getFirst() {
        return first;
    }

    G getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair<T,G> pair = (Pair) object;
            return first == null ? first == pair.first : first.equals(pair.first)
                    && second == null ? second == pair.second : second.equals(pair.second);
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }
}
