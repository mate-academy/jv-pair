package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst();
        String s = pair.getSecond();
        Pair<Integer, String> secondPair = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(secondPair);
        boolean mustAlsoBeTrue = pair.hashCode() == secondPair.hashCode();
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }
}
