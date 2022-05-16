import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    public Main n;

    @Before
    public void setUp() {
        Main n = new Main();
    }

    @Test
    public void jewelsOnStones() {
        String stones = "aAAbbbb";
        String jewels = "aA";
        Assert.assertEquals(3, n.jewelsOnStones(jewels, stones));
    }

    @Test
    public void goodPairs1() {
        int[] input = {1,2,3,1,1,3};
        Assert.assertEquals(4, n.goodPairs(input));
    }
    @Test
    public void goodPairs2() {
        int[] input = {1,1,1,1};
        Assert.assertEquals(6, n.goodPairs(input));
    }
    @Test
    public void goodPairs3() {
        int[] input = {1,2,3};
        Assert.assertEquals(0, n.goodPairs(input));
    }
}