import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineLionParameterizedGetKittensTest {
    private final int kittensCount;
    private final int expected;

    public FelineLionParameterizedGetKittensTest(int kittensCount, int expected){
        this.kittensCount = kittensCount;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] kittensData() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {5, 5},
        };
    }

    @Test
    public void getKittensCountTest(){
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensCountLionTest() throws Exception{
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }

}
