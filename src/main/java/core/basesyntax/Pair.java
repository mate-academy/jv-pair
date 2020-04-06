package core.basesyntax;

class Pair<T1, T2> {
    private T1 t1;
    private T2 t2;

    private Pair(T1 var1, T2 var2) {
        this.t1 = var1;
        this.t2 = var2;
    }

    public T1 getFirst() {
        return t1;
    }

    public T2 getSecond() {
        return t2;
    }

    public static Pair of(Object var1, Object var2) {
        return new Pair(var1, var2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().equals(obj.getClass())) {
            Pair pair = (Pair) obj;
            if ((t1 == null && pair.t1 != null) || (t1 != null && pair.t1 == null)) {
                return false;
            }
            if ((t2 == null && pair.t2 != null) || (t2 != null && pair.t2 == null)) {
                return false;
            }
            return (t1 == null ? t1 == pair.t1 : t1.equals(pair.t1))
                    && (t2 == null ? t2 == pair.t2 : t2.equals(pair.t2));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n = 17;
        n = 31 * n + (t1 != null ? t1.hashCode() : 0);
        n = 31 * n + (t2 != null ? t1.hashCode() : 0);
        return n;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

