package core.basesyntax;

class Pair<T, S> {
    private T t;
    private S s;

    public Pair(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst(){
        return t;
    }

    public S getSecond(){
        return s;
    }

    public static <T,K> Pair<T,K> of(T t, K k){
        return new Pair<>(t,k);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || !obj.getClass().equals(getClass())){
            return false;
        }
        Pair<?,?> pair = (Pair<?,?>) obj;
        return pair.t != null ? pair.t.equals(t) : t==null
                && pair.s != null ? pair.s.equals(s) : s==null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (t != null ? t.hashCode() : 1);
        result = result * 31 + (s != null ? s.hashCode() : 1);
        return result;
    }
}
