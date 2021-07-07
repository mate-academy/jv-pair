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
        Pair<F,S> pair = (Pair)object;
        if (object.getClass().equals(Pair.class)) {
            return firstElement == null && pair.firstElement == null
                    ? true : firstElement != null && firstElement.equals(pair.firstElement)
                    && secondElement == null && pair.secondElement == null
                    ? true : secondElement != null && secondElement.equals(pair.secondElement);
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
