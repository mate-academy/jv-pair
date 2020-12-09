package core.basesyntax;

class Pair<T, V> {
    private T firstParameter;
    private V secondParameter;

    public Pair(T firstParameter, V secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public static <T, V> Pair<T, V> of(T firstParameter, V secondParameter) {
        return new Pair<>(firstParameter, secondParameter);
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
        if (compared.getClass().equals(getClass())) {
            Pair currentCompared = (Pair) compared;
            return ((firstParameter == currentCompared.firstParameter
                    || (firstParameter != null
                    && firstParameter.equals(currentCompared.firstParameter)))
                    && (secondParameter == currentCompared.firstParameter
                    || (secondParameter != null
                    && secondParameter.equals(currentCompared.secondParameter))));
        }
        return false;
    }
}
