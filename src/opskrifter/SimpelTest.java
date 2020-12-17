package opskrifter; /**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/12/2020
 */

public class SimpelTest {

    static Opskrift glasurOpskrift;
    static Opskrift teOpskrift;

    public static void main(String[] args) {

        blankLinje();
        System.out.println("Velkommen til min opskrifts-applikations-dummy"); // EKSEMPEL på sout
        blankLinje();

        System.out.println("***********************");
        System.out.println("* Opretter opskrifter *");
        System.out.println("***********************");
        blankLinje();

        opretOpskrifter();

        System.out.println("***********************");
        System.out.println("*** Viser opskrifter **");
        System.out.println("***********************");
        blankLinje();

        glasurOpskrift.visIngredienser();
        glasurOpskrift.visFremgangsmaade();
        blankLinje();

        teOpskrift.visOpskrift();
        blankLinje();

        System.out.println("***********************");
        System.out.println("*** Kalorieberegning **");
        System.out.println("***********************");
        blankLinje();
        String resultat ="";
        if (!teOpskrift.getIngredienser().get(2).rigPaaKalorier()) { resultat = " ikke";}
        System.out.println("Citron er" + resultat + " rig på kalorier.");

        System.out.println("***********************");
        System.out.println("*** Ingredienssøgning **");
        System.out.println("***********************");
        System.out.println("Te indeholder kød: " + teOpskrift.indeholderDiet(Diet.KØD));
        System.out.println("Te indeholder sukker: " + teOpskrift.indeholderDiet(Diet.SUKKER));
        blankLinje();

    }

    private static void opretOpskrifter() {
        glasurOpskrift = new Opskrift();

        glasurOpskrift.setNavn("Glasur");
        glasurOpskrift.setFremgangsmaade("Du blander flormelis og sukker, og smører det på kagen.");
        glasurOpskrift.setTilberedningstid(10);
        glasurOpskrift.setAntalPortioner(4);
        glasurOpskrift.addIngrediens("Flormelis", 10);
        glasurOpskrift.addIngrediens("Vand", 0);
        blankLinje();


        teOpskrift = new Opskrift("Te", "Put teen i kogende vand, vent 2 minutter og server.", 5, 0);
        teOpskrift.addIngrediens("Te", 1);
        teOpskrift.addIngrediens("Vand", 0);
        Ingrediens citron = new IngrediensMedNaeringsdetaljer("Citron", 10, 10, 5, 10);
        teOpskrift.addIngrediens(citron);
        Ingrediens sukker = new IngrediensMedNaeringsdetaljer("Sukker", 100, 0,0,0);
        sukker.setDiet(Diet.SUKKER);
        teOpskrift.addIngrediens(sukker);
        blankLinje();

    }

    static void blankLinje() {
        System.out.println();
    } // EKSEMPEL på en emegt simpel metode

}
