package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class PairTest {

    private Pair firstPair = Pair.of(5, "Five");
    private Pair secondPair = Pair.of(2, "Two");
    private Pair thirdPair = Pair.of(5, "Five");

    @Test
    public void pairsAreEquals() {
        Assert.assertEquals(firstPair, thirdPair);
    }

    @Test
    public void pairsAreNotEquals() {
        Assert.assertNotEquals(firstPair, secondPair);
    }

    @Test
    public void getFirstMethodTest() {
        Assert.assertEquals("getFirst() method doesn't work correctly",5, firstPair.getFirst());
        Assert.assertEquals("getFirst() method doesn't work correctly",5, thirdPair.getFirst());
        Assert.assertNotEquals("getFirst() method doesn't work correctly",1,
                thirdPair.getFirst());
        Assert.assertNotEquals("getFirst() method doesn't work correctly",3, thirdPair.getFirst());
    }

    @Test
    public void getSecondMethodTest() {
        Assert.assertEquals("getSecond() method doesn't work correctly","Five",
                firstPair.getSecond());
        Assert.assertEquals("getSecond() method doesn't work correctly","Five",
                thirdPair.getSecond());
        Assert.assertNotEquals("getSecond() method doesn't work correctly","five",
                thirdPair.getSecond());
        Assert.assertNotEquals("getSecond() method doesn't work correctly","five",
                thirdPair.getSecond());
    }

    @Test
    public void hashCodeTest() {
        Assert.assertEquals("Hash codes are not equal!", firstPair.hashCode(), thirdPair.hashCode());
        Assert.assertNotEquals("Hash codes are not equal!", firstPair.hashCode(), secondPair.hashCode());
    }


}
