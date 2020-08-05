package core.basesyntax;

class Pair<T, X> {
    private T model;
    private X name;

    private Pair(T model, X name) {
        this.model = model;
        this.name = name;
    }

    public T getFirst() {
        return model;
    }

    public X getSecond() {
        return name;
    }

    public static <T, X> Pair<T, X> of(T model, X name) {
        return new Pair<>(model, name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair<T, X> pair = (Pair<T, X>) obj;
        return (model == pair.model || (model != null && model.equals(pair.model)))
                && (name == pair.name || (name != null && name.equals(pair.name)));
    }
}
