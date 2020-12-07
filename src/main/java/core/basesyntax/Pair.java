package core.basesyntax;

class Pair <F, S>{
    private F first;
    private S second;

    private Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <F, S> Pair of(F first, S second){
        return new Pair(first, second);
    }

    @Override
    public int hashCode() {
        int result = 0;
        result += getFirst() == null ? 0 : 31 * getFirst().hashCode();
        result *= getSecond() == null ? 1 : 31 * getSecond().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
