package core.basesyntax;

class Pair<F, S> {
    private F firstElement;
    private S secondElement;

    private Pair(F firstElement, S secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public F getFirst() {
        return firstElement;
    }

    public S getSecond() {
        return secondElement;
    }

    public static <F, S> Pair of(F firstElement, S secondElement) {
        return new Pair<F, S>(firstElement, secondElement);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Pair.class)) {
            Pair<F, S> pair = (Pair) object;
            return firstElement == pair.firstElement
                    || firstElement != null && firstElement.equals(pair.firstElement)
                    && secondElement == pair.secondElement
                    || secondElement != null && secondElement.equals(pair.secondElement);
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (firstElement != null && secondElement != null) {
            int result = 17;
            result = 31 * result + firstElement.hashCode();
            result = 31 * result + secondElement.hashCode();
            return result;
        }
        return 0;
    }
}
