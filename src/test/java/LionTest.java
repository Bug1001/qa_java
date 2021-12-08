import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionTest {


    @Test
    public void lionExceptionTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Орпорп", feline);
        }
        catch(Exception noSuchSexException) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", noSuchSexException.getMessage());
        }
    }

    @Test
    public void lionGetKittensDefaultValueTest() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(1, lion.getKittens());
    }

}
