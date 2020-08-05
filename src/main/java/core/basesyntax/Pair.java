package core.basesyntax;

import java.util.Objects;

public class Pair<T, V> {
    T number;
    V name;

    private Pair(T age, V name) {
        this.number = age;
        this.name = name;
    }

    public T getFirst() {
        return number;

    }

    public V getSecond() {
        return name;
    }

    public static <T, V> Pair<T, V> of(T age, V name) {
        return new Pair<>(age, name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        final int prime = 31;
        result = prime * result + Objects.hashCode(number);
        result = prime * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Pair.class)) {
            Pair<T, V> pair = (Pair<T, V>) obj;
            return (number == pair.number) || (number != null && number.equals(pair.number))
                    && (name == pair.name) || (name != null
                    && name.equals(pair.name));
        }
        return false;
    }
}
