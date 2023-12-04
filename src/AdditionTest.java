import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {
    @Test
    public void addEquals(){
        System.out.println("Test addEquals");
        assertEquals(Addition.add(5,4 ),9);
    }

    @Test
    public void addNotEquals(){
        System.out.println("test not equals");
        assertNotEquals(Addition.add(1, 1),3);
    }


}