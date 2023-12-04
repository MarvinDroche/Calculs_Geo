import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProduitTest {
    @Test
    public void prodEquals(){
        System.out.println("Test prodEquals");
        assertEquals(Produit.prod(5,4 ),20);
    }

    @Test
    public void prodNotEquals(){
        System.out.println("test not prodequals");
        assertNotEquals(Produit.prod(1, 4),3);
    }

}