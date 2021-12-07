import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import com.example.AsexualException;

import static org.junit.Assert.assertEquals;

public class LionExceptionTest {


    @Test
    public void lionTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Бесполый", feline);
        }
        catch (AsexualException onlyForPeopleException) {
            assertEquals("Это только для людей", onlyForPeopleException.getMessage());
        }

        catch(Exception noSuchSexException) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", noSuchSexException.getMessage());
        }

        try {
            Lion lion = new Lion("Орпорп", feline);
        }
        catch (AsexualException onlyForPeopleException) {
            assertEquals("Это только для людей", onlyForPeopleException.getMessage());
        }

        catch(Exception noSuchSexException) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", noSuchSexException.getMessage());
        }
}

}
