package core.basesyntax;

class Pair <T, K>{
    private T t;
    private K k;
    private Pair(T t, K k){
        this.t = t;
        this.k = k;
    }

    public static <T, K> Pair of(T t, K k){
          return  new Pair(t, k);
    }

    public T getFirst(){
        T object_1 = t;
        return object_1;
    }
    public K getSecond(){
        K object_2 = k;
        return object_2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (t!= null) {
            result = prime * result + t.hashCode();
        }
        if (k!= null) {
            result = prime * result + k.hashCode();
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null){
            return false;
        }
        if (obj.getClass().equals(Pair.class)){
            Pair pair = (Pair) obj;
            return t!= null ? t.equals(pair.t)
                    : pair.t == null
                    && k!= null ? k.equals(pair.k)
                    : pair.k == null;
        }
        return false;
    }
}
