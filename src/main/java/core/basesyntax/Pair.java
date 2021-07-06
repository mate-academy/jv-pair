package core.basesyntax;

class Pair<I, S> {
    private I id;
    private S name;

    private Pair(I id, S name) {
        this.id = id;
        this.name = name;
    }

    public I getFirst() {
        return id;
    }

    public S getSecond() {
        return name;
    }

    public static <I, S> Pair<I, S> of(I id, S name) {
        return new Pair(id, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        Pair<?,?> pair = (Pair<?,?>) obj;
        return (id == null ? id == pair.id : id.equals(pair.id)
                && name == null ? name == pair.name : name.equals(pair.name));
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (id == null ? 0 : id.hashCode());
        result = 31 * result + (name == null ? 0 : name.hashCode());
        return result;
    }
}
