import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SurfaceTest {
    @Test
    public void surfaceEquals(){
        System.out.println("Test surfaceEquals");
        assertEquals(Surface.surface(5,4 ),20);
    }

    @Test
    public void surfaceNotEquals(){
        System.out.println("test surface not equals");
        assertNotEquals(Surface.surface(1, 4),3);
    }

}