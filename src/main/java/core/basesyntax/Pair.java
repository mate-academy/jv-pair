package core.basesyntax;

class Pair<T, T2> {

    private final T fistThing;
    private final T2 secondThing;

    private Pair(T fistThing, T2 secondThing) {
        this.fistThing = fistThing;
        this.secondThing = secondThing;
    }

    public T getFirst() {
        return fistThing;
    }

    public T2 getSecond() {
        return secondThing;
    }

    public static <T, T2> Pair<T, T2> of(T t, T2 t2) {
        return new Pair<>(t, t2);
    }

    @Override
    public int hashCode() {
        return 71 * 31 + (fistThing == null ? 0 : fistThing.hashCode())
                * 71 * 31 + (secondThing == null ? 0 : secondThing.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Pair<T, T2> object = (Pair<T, T2>) obj;
        if (this.fistThing == null ^ object.fistThing == null
                || this.secondThing == null ^ object.secondThing == null) {
            return false;
        }
        if (this.getClass().equals(object.getClass())) {
            return (this.fistThing == null && this.secondThing == null)
                    || (this.fistThing != null && this.secondThing != null)
                    && ((this.fistThing.equals(object.fistThing)
                    && this.secondThing.equals(object.secondThing))
                    && this.fistThing.hashCode() == object.fistThing.hashCode()
                    && this.secondThing.hashCode() == object.secondThing.hashCode());
        }
        return false;
    }
}
