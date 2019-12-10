package core.basesyntax;

class Pair<F, S> {

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

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime + result * first.hashCode();
        result = prime + result * second.hashCode();
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Pair pair = (Pair) obj;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair<>(first, second);
    }

}
