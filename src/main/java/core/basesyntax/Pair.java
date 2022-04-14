package core.basesyntax;

class Pair<N, A> {
    private N name;
    private A age;

    private Pair(N name, A age) {
        this.name = name;
        this.age = age;
    }

    public static <N, A> Pair<N, A> of(N name, A age) {
        return new Pair<>(name, age);
    }

    public N getFirst() {
        return name;
    }

    public A getSecond() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Pair.class)) {
            Pair current = (Pair) obj;
            return (name != null && this.name.equals(current.name)
                    || name == null && current.name == null) && (age != null
                    && this.age.equals(current.age) || age == null && current.age == null);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (age == null ? 0 : age.hashCode());
        return result;
    }
}
