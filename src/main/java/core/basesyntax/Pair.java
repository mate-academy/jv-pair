package core.basesyntax;

class Pair<Type1, Type2> {
    private Type1 first;
    private Type2 second;

    private Pair(Type1 first, Type2 second) {
        this.first = first;
        this.second = second;
    }

    public Type1 getFirst() {
        return first;
    }

    public void setFirst(Type1 first) {
        this.first = first;
    }

    public Type2 getSecond() {
        return second;
    }

    public void setSecond(Type2 second) {
        this.second = second;
    }

    static <Type1, Type2> Pair of(Type1 first, Type2 second) {
        return new Pair<>(first, second);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Pair)) return false;
        Pair<Type1, Type2> pair = (Pair<Type1, Type2>) object;
        return java.util.Objects.equals(first, pair.getFirst()) &&
                java.util.Objects.equals(second, pair.getSecond());
    }

    public int hashCode() {
        return java.util.Objects.hash(first, second);
    }
}
