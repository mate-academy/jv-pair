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
            if ((first != null && pair.getFirst() == null)
                    || (first == null && pair.getFirst() != null)
                    || (second != null && pair.getSecond() == null)
                    || (second == null && pair.getSecond() != null)) {
                return false;
            }
            return (((first == null && pair.getFirst() == null)
                    || first.equals(pair.getFirst()))
                    && ((second == null && pair.getSecond() == null)
                    || second.equals(pair.getSecond())));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        if (first != null) {
            result = result * getFirst().hashCode();
        }
        if (second != null) {
            result = result * getSecond().hashCode();
        }
        return result;
    }
}
