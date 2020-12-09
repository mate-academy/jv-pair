package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> secondPair = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(secondPair); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == secondPair.hashCode(); // true!
    }
}
