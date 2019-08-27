package core.basesyntax;

    class Pair<T,V> {
        T obj1;
        V obj2;

        private Pair(T ob1, V ob2) {
            obj1 = ob1;
            obj2 = ob2;
        }

        public T getFirst() {
            return obj1;
        }

        public V getSecond() {
            return obj2;
        }

        public static <T, V> Pair<T, V> of(T value, V value2) {
            return new Pair<>(value, value2);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object instanceof Pair) {
                Pair pair = (Pair) object;
                if (obj1 != null ? !obj1.equals(pair.obj1) : pair.obj1 != null) {
                    return false;
                }
                if (obj2 != null ? !obj2.equals(pair.obj2) : pair.obj2 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hash = 7;
            hash *= 31 + (obj1 != null ? obj1.hashCode() : 0);
            hash *= 31 + (obj2 != null ? obj2.hashCode() : 0);
            return hash;
        }

    }