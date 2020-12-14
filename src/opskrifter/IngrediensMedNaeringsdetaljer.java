package opskrifter; /**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/12/2020
 */

public class IngrediensMedNaeringsdetaljer extends Ingrediens {

    int cVitamin;
    int magnesium;
    int kalk;

    public IngrediensMedNaeringsdetaljer(String navn, int kalorier, int cVitamin, int magnesium, int kalk) {
        super(navn, kalorier);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.kalk = kalk;
    }

    boolean godModForkølelse() {
        if (cVitamin>5) { return true;}
        else { return false; }
    }
}
