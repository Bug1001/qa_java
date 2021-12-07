import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlexTest {

    @Test
    public void alexHasManeTest() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        Assert.assertEquals(true, alex.doesHaveMane());
    }

    @Test
    public void alexGetFriendsTest() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void alexGetPlaceOfLivingTest() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void alexGetKittensTest() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        Assert.assertEquals(0, alex.getKittens());
    }
}
