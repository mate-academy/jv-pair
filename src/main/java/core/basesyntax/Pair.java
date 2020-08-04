package core.basesyntax;

class Pair<F,S> {
    private F first;
    private S second;

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

    public static <F, S> Pair of(F first, S second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Pair.class)) {
            if (this == object) {
                return true;
            }
            Pair pair = (Pair) object;
            return (first == pair.first
                    || (first != null && first.equals(pair.first)))
                    && (second == pair.second
                    || (second != null && second.equals(pair.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int number = 11;
        int result = 5;
        result = number * result + ((first == null) ? 0 : first.hashCode());
        result = number * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }
}
