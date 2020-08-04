package core.basesyntax;

class Pair<F, S> {
    private F firstParameter;
    private S secondParameter;

    private Pair(F first, S second) {
        this.firstParameter = first;
        this.secondParameter = second;
    }

    public F getFirst() {
        return this.firstParameter;
    }

    public S getSecond() {
        return this.secondParameter;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.hashCode() != o.hashCode()) {
            return false;
        }
        if (getClass() == o.getClass()) {
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return (((Pair<?, ?>) o).firstParameter == pair.firstParameter
                    || ((Pair<?, ?>) o).firstParameter.equals(pair.firstParameter))
                    && (((Pair<?, ?>) o).secondParameter == pair.secondParameter
                    || ((Pair<?, ?>) o).secondParameter.equals(pair.secondParameter));
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstParameter == null) ? 0 : firstParameter.hashCode());
        result = prime * result + ((secondParameter == null) ? 0 : secondParameter.hashCode());
        return result;
    }
}
