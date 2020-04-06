package core.basesyntax;

class Pair<F, S> {
    private F firstElement;
    private S secondElement;

    private Pair(F first, S second) {
        this.firstElement = first;
        this.secondElement = second;
    }

    public F getFirst() {
        return firstElement;
    }

    public S getSecond() {
        return secondElement;
    }

    public static <F,S> Pair of(F first, S second) {
        return new Pair<F,S>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        Pair<F,S> pair = (Pair<F,S>)object;
        if (object.getClass().equals(Pair.class)) {
            if (firstElement == null && secondElement == null) {
                return true;
            }
            return firstElement.equals(pair.firstElement)
                    && secondElement.equals(pair.secondElement);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (firstElement != null) {
            result = result * 31 + firstElement.hashCode();
        }
        if (secondElement != null) {
            result = result * 31 + secondElement.hashCode();
        }
        return result;
    }
}
