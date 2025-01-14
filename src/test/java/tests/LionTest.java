package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getCorrectReturnFoodForLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> foods = lion.getFood();
        Assert.assertEquals(expectedFood, foods);
    }

    @Test
    public void getKittensNeedBeReturnOne() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittens);
        assertEquals(expectedKittens, lion.getKittens());
    }

    @Test
    public void chekingSexLion() {
        Exception actual = Assert.assertThrows(Exception.class, () -> new Lion("Что-то иное", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", actual.getMessage());
    }
}