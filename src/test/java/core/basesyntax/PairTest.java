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
        Method[] methods = pairClass.getDeclaredMethods();
        Assert.assertTrue("Not all methods were implemented", methods.length >= 5);
        int requiredMethodsCount = 0;
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("hashCode") ||
                    method.getName().equalsIgnoreCase("equals") ||
                    method.getName().equalsIgnoreCase("of") ||
                    method.getName().equalsIgnoreCase("getFirst") ||
                    method.getName().equalsIgnoreCase("getSecond")) {
                requiredMethodsCount++;
            }
        }
        Assert.assertTrue("Not all required methods are implemented!", requiredMethodsCount >= 5);
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
    public void sameObjectHashCodeEqualityTest() {
        Assert.assertEquals("Hash code in the one object is not the same for multiple hash code " +
                "methods calling", firstPair.hashCode(), firstPair.hashCode());
        Assert.assertEquals("Hash code in the one object is not the same for multiple hash code " +
                "methods calling", secondPair.hashCode(), secondPair.hashCode());
        Assert.assertEquals("Hash code in the one object is not the same for multiple hash code " +
                "methods calling", thirdPair.hashCode(), thirdPair.hashCode());
    }

    @Test
    public void hashCodeTest() {
        Assert.assertEquals("Hash codes are not equal!", firstPair.hashCode(), thirdPair.hashCode());
        Assert.assertNotEquals("Hash codes should not be equal!", firstPair.hashCode(),
                secondPair.hashCode());
    }

    @Test
    public void getFirstMethodTest() {
        Assert.assertEquals(5, firstPair.getFirst());
        Assert.assertEquals(2, secondPair.getFirst());
    }

    @Test
    public void getSecondMethodTest() {
        Assert.assertEquals("Five", firstPair.getSecond());
        Assert.assertEquals("Two", secondPair.getSecond());
    }
}
