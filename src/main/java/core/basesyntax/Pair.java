package core.basesyntax;

class Pair<A, B> {
    A first;
    B second;

    private Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public static Pair of(Object a, Object b) {
        return new Pair(a, b);
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public int hashCode() {
        return 31 * (first == null ? 0 : first.hashCode())
                + 31 * (second == null ? 0 : second.hashCode());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair pair = (Pair) object;
            if ((pair.first == null && pair.second == null)
                    && (this.first != null || this.second != null)) {
                return false;
            }
            return ((pair.first == null && this.first == null)
                    || pair.first.equals(this.first))
                    && ((pair.second == null && this.second == null)
                    || pair.second.equals(this.second));
        }
        return false;
    }
}
