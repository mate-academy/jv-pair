package core.basesyntax;

class Pair {
    Object first;
    Object second;

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;

    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public static Pair of(Object first, Object second) {
        Pair pair = new Pair();
        pair.first = first;
        pair.second = second;
        return pair;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() == Pair.class) {
            Pair pair = (Pair) object;
            return !((first != null && pair.first == null)
                    || (first == null && pair.first != null)
                    || (second != null && pair.second == null)
                    || (second == null && pair.second != null))
                    && (((first == null && pair.first == null)
                    || first.equals(pair.first))
                    && ((second == null && pair.second == null)
                    || second.equals(pair.second)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        if (first != null) {
            result = 31 * result * getFirst().hashCode();
        }
        if (second != null) {
            result = 31 * result * getSecond().hashCode();
        }
        return result;
    }
}
