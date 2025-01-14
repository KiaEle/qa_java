package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean hasMane;
    @Mock
    Feline feline;

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getHasMane() {
        return new Object[][]{{"Самец", true}, {"Самка", false},};
    }

    @Before
    public void initMocks() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void checkingLionHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals("Некорректно передано условие,наличие гривы", hasMane, lion.doesHaveMane());
    }
}