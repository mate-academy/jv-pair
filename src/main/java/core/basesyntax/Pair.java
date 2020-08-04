package core.basesyntax;

class Pair<F, S> {
    private F first;
    private S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair of(F first, S second) {
        return new<F, S> Pair(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o.getClass().equals(Pair.class))) {
            return false;
        }
        Pair<F, S> pair = (Pair<F, S>) o;
        return (first == null || pair.first == null
                ? first == pair.first : first.equals(pair.first))
                && (second == null || pair.second == null
                ? second == pair.second : second.equals(pair.second));
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 17 + (first == null ? 0 : first.hashCode());
        result = result * 17 + (second == null ? 0 : second.hashCode());
        return result;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }
}
