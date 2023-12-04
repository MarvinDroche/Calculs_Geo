import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerimetreTest {
    @Test
    public void perimetreEquals(){
        System.out.println("Test perimetre Equals");
        assertEquals(Perimetre.perimetre(5,4, 2 ),18);
    }

    @Test
    public void perimetreNotEquals(){
        System.out.println("test perimetre not equals");
        assertNotEquals(Perimetre.perimetre(1, 4, 7),3);
    }

}