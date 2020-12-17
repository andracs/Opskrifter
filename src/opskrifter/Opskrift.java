/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/12/2020
 */

package opskrifter;

import java.util.ArrayList;

public class Opskrift implements KalorieBeregner {

    private String navn;
    private String fremgangsmaade;
    private int antalPortioner;
    private int tilberedningstid;
    private ArrayList<Ingrediens> ingredienser = new ArrayList<>();

    // EKSEMPEL på noarg constructor
    public Opskrift() {
        System.out.println("opskrifter.Opskrift er oprettet: Uden navn ");
    }

    // EKSEMPEL på overloaded constructor
    public Opskrift(String navn, String fremgangsmaade, int tilberedningstid, int antalPortioner) {
        this.navn = navn;
        this.fremgangsmaade = fremgangsmaade;
        this.tilberedningstid = tilberedningstid;
        this.antalPortioner = antalPortioner;
        System.out.println("opskrifter.Opskrift er oprettet: " + navn );
    }

    // EKSEMPEL på metode
    public void addIngrediens(Ingrediens ingrediens) {
        ingredienser.add(ingrediens);
    }

    // EKSEMPEL på metode overloading
    public void addIngrediens(String navn, int kalorier) {
        Ingrediens ingrediens = new Ingrediens(navn, kalorier);
        ingredienser.add(ingrediens);
    }

    // EKSEMPEL på et foreach loop
    public void visIngredienser() {
        System.out.println("Du skal til " + navn.toLowerCase() + " bruge:");
        for (Ingrediens ingrediens : ingredienser) {
            System.out.println(" - " + ingrediens.getNavn());
        }
    }

    public void visFremgangsmaade() {
        System.out.println("Opskriften for " + navn.toLowerCase() + ": ");
        System.out.println("- " +fremgangsmaade);
    }

    // EKSEMPEL på metodekald
    void visOpskrift() {
        visIngredienser();
        visFremgangsmaade();
        System.out.println("Opskriften indeholder "  + kalorieriAlt() + " kalorier i alt, og " + kalorierPerPortion() + " per portion.");
    }

    // EKSEMPEL på et for i loop
    public int kalorieriAlt() {
        int kalorier = 0;
        for (int i = 0; i < ingredienser.size(); i++) {
            kalorier += ingredienser.get(i).getKalorier();
        }
        return kalorier;
    }

    int kalorierPerPortion() {
        int kalorierIAlt = kalorieriAlt();
        int kalorierPerPortion = 0;
        try {kalorierPerPortion = kalorierIAlt / antalPortioner; } // EKSEMPEL på en try / catch exception
        catch (Exception e) {
            System.out.println("FEJL - opskriften " + navn + " må ikke have 0 portioner!" +e);
        }
        return kalorierPerPortion;
    }

    public String visIngredienserTilGUI() {
        String ingredienserFormatteret = "";
        for (Ingrediens ingrediens : ingredienser) {
            ingredienserFormatteret += (" - " + ingrediens.getNavn() + "\n");
        }
        return ingredienserFormatteret;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFremgangsmaade() {
        return fremgangsmaade;
    }

    public void setFremgangsmaade(String fremgangsmaade) {
        this.fremgangsmaade = fremgangsmaade;
    }

    public int getTilberedningstid() {
        return tilberedningstid;
    }

    public void setTilberedningstid(int tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }

    public int getAntalPortioner() {
        return antalPortioner;
    }

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    public ArrayList<Ingrediens> getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(ArrayList<Ingrediens> ingredienser) {
        this.ingredienser = ingredienser;
    }

}
