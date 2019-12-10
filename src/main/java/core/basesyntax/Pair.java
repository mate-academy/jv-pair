package core.basesyntax;

class Pair<A, B> {
    private A first;
    private B second;

    private Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ((first == pair.getFirst() || (first != null && first.equals(pair.getFirst()))));
    }

    @Override
    public int hashCode() {
        return 31 * second.hashCode() * first.hashCode();
    }

    public static <A, B> Pair of(A first, B second) {
        return new Pair<>(first, second);
    }
}
