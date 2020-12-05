package core.basesyntax;

class Pair<F, S> {
    private F firstElement;
    private S secondElement;
    
    private Pair(F firstElement, S secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }
    
    public static <F, S> Pair<F, S> of(F firstElement, S secondElement) {
        return new Pair<>(firstElement, secondElement);
    }
    
    public F getFirst() {
        return firstElement;
    }
    
    public S getSecond() {
        return secondElement;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair<F, S> pair = (Pair<F, S>) obj;
        return ((firstElement == pair.firstElement)
                || (firstElement != null && firstElement.equals(pair.firstElement)))
                && ((secondElement == pair.secondElement)
                || (secondElement != null && secondElement.equals(pair.secondElement)));
    }
    
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (firstElement == null ? 0 : firstElement.hashCode());
        result = 31 * result + (secondElement == null ? 0 : secondElement.hashCode());
        return result;
    }
}
