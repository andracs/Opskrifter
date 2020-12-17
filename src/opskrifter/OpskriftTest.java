package opskrifter;

import static org.junit.Assert.*;

public class OpskriftTest {

    @org.junit.Test
    public void kalorieriAltTest() {
        Opskrift opskrift = new Opskrift();
        opskrift.addIngrediens("Æg", 20);
        opskrift.addIngrediens("Bacon", 100);
        opskrift.addIngrediens("Løg", 5);
        int antalKalorier = opskrift.kalorieriAlt();
        assertEquals(125, antalKalorier);

    }

    @org.junit.Test
    public void kalorierPerPortionTest() {
        Opskrift opskrift = new Opskrift();
        opskrift.addIngrediens("Æg", 20);
        opskrift.addIngrediens("Bacon", 100);
        opskrift.addIngrediens("Løg", 5);
        opskrift.setAntalPortioner(5);
        int antalKalorierPerPOrtion = opskrift.kalorierPerPortion();
        assertEquals(25, antalKalorierPerPOrtion);
    }
}