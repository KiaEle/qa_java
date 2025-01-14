package tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {


    @Mock
    Feline feline;

    @Test
    public void getResultingSoundNeedBeMeow() {
        Cat cat = new Cat(feline);
        String expectedSoundCat = "Мяу";
        assertEquals("Кот не промяукал !", expectedSoundCat, cat.getSound());
    }

    @Test
    public void getCorrectReturnFoodForCat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFoodCat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFoodCat);
        assertEquals(expectedFoodCat, cat.getFood());
    }
}