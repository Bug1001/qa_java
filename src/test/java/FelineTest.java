import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Animal animal;

    @Test
    public void felineFoodTest() throws Exception {
            Feline feline = new Feline();
            feline.eatMeat();
            Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));

    }

    @Test
    public void felineGetFamilyTest(){
        Feline feline = new Feline();

        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultValueTest(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }




}