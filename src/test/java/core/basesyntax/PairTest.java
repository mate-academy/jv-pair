package core.basesyntax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

public class PairTest {

    private Pair firstPair;
    private Pair secondPair;
    private Pair thirdPair;

    @Before
    public void init() {
        firstPair = Pair.of(5, "Five");
        secondPair = Pair.of(2, "Two");
        thirdPair = Pair.of(5, "Five");
    }

    @Test
    public void methodsCheck() {
        Class<Pair> pairClass = Pair.class;
        Method[] methods = pairClass.getMethods();
        Assert.assertTrue("Not all methods were implemented", methods.length >= 5);
    }

    @Test
    public void pairsAreEquals() {
        Assert.assertEquals(firstPair, thirdPair);
    }

    @Test
    public void pairsAreNotEquals() {
        Assert.assertNotEquals(firstPair, secondPair);
    }

    @Test
    public void hashCodeTest() {
        Assert.assertEquals("Hash codes are not equal!", firstPair.hashCode(), thirdPair.hashCode());
        Assert.assertNotEquals("Hash codes are not equal!", firstPair.hashCode(), secondPair.hashCode());
    }

    @Test
    public void getFirstTest() {
        Assert.assertEquals(5, firstPair.getFirst());
        Assert.assertEquals(2, secondPair.getFirst());
    }

    @Test
    public void getSecondTest() {
        Assert.assertEquals("Five", firstPair.getSecond());
        Assert.assertEquals("Two", secondPair.getSecond());
    }
}
