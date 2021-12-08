import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expected;
    private static final Feline feline = new Feline();

    public LionParameterizedTest(String sex, Feline feline,  boolean expected) {
        this.sex = sex;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] lionData() {
        return new Object[][]{
                {"Самец", feline, true},
                {"Самка", feline, false},
        };
    }

    @Test
    public void lionHasManeTest() throws Exception {

        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());

    }

}