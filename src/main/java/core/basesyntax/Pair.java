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

    @Override

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !getClass().equals(object.getClass())) {
            return false;
        }
        Pair<F, S> pair = (Pair) object;
        return (first == pair.getFirst()
                || (first != null && first.equals(pair.getFirst())))
                && (second == pair.getSecond()
                || (second != null && (second.equals(pair.getSecond()))));
    }

    @Override
    public int hashCode() {
        int constant = 19;
        if (getFirst().equals(0)) {
            constant = constant * 29;
        } else {
            constant = constant * 29 + getFirst().hashCode();
        }
        if (getSecond().equals(0)) {
            constant = constant * 29;
        } else {
            constant = constant * 29 + getSecond().hashCode();
        }
        return constant;
    }

    public static <F, S> Pair of(F first, S second) {
        return new Pair(first, second);
    }
}

