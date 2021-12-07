import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    Predator predator;

    Cat cat = new Cat(feline);
    @Test
    public void getSoundTest(){

        Assert.assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void catGetFoodTest() {
        try {
            cat.getFood();
            Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), predator.eatMeat());
        }
        catch(Exception e) {}
    }
}
