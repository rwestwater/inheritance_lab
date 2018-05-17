import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheepTest {

    Sheep sheep;

    @Before
    public void before(){
        sheep = new Sheep ("Sheep", "Baa Baa");
    }

    @Test
    public void hasSpecies(){
        assertEquals("Sheep", sheep.getSpecies());
    }


}
