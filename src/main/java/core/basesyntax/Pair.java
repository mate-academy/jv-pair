package core.basesyntax;

class Pair <T1, T2> {
    private T1 first;
    private T2 second;

    private Pair(T1 firstItem, T2 secondItem) {
        this.first = firstItem;
        this.second = secondItem;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    static <T1, T2> Pair of(T1 t1, T2 t2){
        return new Pair(t1, t2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(getClass() == obj.getClass())) {
            return false;
        }
        if ((this.first == null ^ ((Pair<T1, T2>) obj).first == null)
                || (this.second == null ^ ((Pair<T1, T2>) obj).second == null)) {
            return false;
        }
        return ((this.first == null && ((Pair<T1, T2>) obj).first == null)
                || this.first.equals(((Pair<T1, T2>) obj).first))
                && ((this.second == null && ((Pair<T1, T2>) obj).second == null)
                || this.second.equals(((Pair<T1, T2>) obj).second));

    }


    @Override
    public int hashCode() {
        int result = 3;
        if (this.getFirst() != null) {
            result = result * 11 + this.first.hashCode();
        }
        if (this.getSecond() != null) {
            result = result * 11 + this.second.hashCode();
        }
        return result;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst();
        String s = pair.getSecond();

        Pair<Integer, String> pair2 = Pair.of(1,  "hello");
        boolean mustBeTrue = pair.equals(pair2);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }
}
