package tests;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;

    @Test
    public void getResultingCountKittensLionAlex() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int expectedKittensLionAlex = 0;
        assertEquals("У льва Алекса нету котят !", expectedKittensLionAlex, lionAlex.getKittens());
    }

    @Test
    public void getPlaceOfLivingIsCorrect() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expectedPlaceLionAlex = "Нью-Йоркский зоопарк";
        assertEquals("Лев Алекс проживает не в этом месте !", expectedPlaceLionAlex, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getFriendsIsCorrect() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expectedFriendsLionAlex = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        assertEquals("Неверный список друзей льва Алекса !", expectedFriendsLionAlex, lionAlex.getFriends());
    }
}