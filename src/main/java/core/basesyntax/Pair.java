package core.basesyntax;

class Pair<T> {
    private T firstParameter;
    private T secondParameter;

    public Pair(T firstParameter, T secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public static <T> Pair of(T firstParameter, T secondParameter) {
        return new Pair(firstParameter, secondParameter);
    }

    public Object getFirst() {
        return firstParameter;
    }

    public Object getSecond() {
        return secondParameter;
    }

    public int hashCode() {
        int result = 17;
        result = result * 31 + (firstParameter == null ? 0 : firstParameter.hashCode());
        result = result * 31 + (secondParameter == null ? 0 : secondParameter.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        if (compared == null) {
            return false;
        }
        if (compared.getClass().equals(Pair.class)) {
            Pair currentCompared = (Pair) compared;
            return ((this.firstParameter == currentCompared.firstParameter
                    || (this.firstParameter != null
                    && this.firstParameter.equals(currentCompared.firstParameter)))
                    && (this.secondParameter == currentCompared.firstParameter
                    || (this.secondParameter != null
                    && this.secondParameter.equals(currentCompared.secondParameter))));
        }
        return false;
    }
}
