package tests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getCorrectReturnFoodForFeline() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Кошачьи едят рыбу , птиц и животных", expectedFood, feline.eatMeat());
    }

    @Test
    public void getReturnFamilyFeline() {
        Feline feline = new Feline();
        assertEquals("Не соответствует семейству кошачьих", feline.getFamily(), "Кошачьи");
    }

    @Test
    public void getResultingCountKittensNeedBeOne() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        assertEquals("Кол-во котят отличается !", expectedKittensCount, feline.getKittens());
    }

    @Test
    public void getReturnResultInputCountKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 5;
        int actualCountKittens = feline.getKittens(5);
        assertEquals("Кол-во котят разные !", expectedKittensCount, actualCountKittens);

    }
}