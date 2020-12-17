package opskrifter; /**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/12/2020
 */

// EKSEMPEL på nedarvning
public class Ingrediens implements KalorieBeregner {
    private String navn;
    private int kalorier;
    private Diet diet = null;

    public Ingrediens(String navn, int kalorier) {
        this.navn = navn;
        this.kalorier = kalorier;
        System.out.println("opskrifter.Ingrediens er oprettet: " + navn);
    }

    // EKSEMPEL på if sætning
    public boolean rigPaaKalorier() {
        if (kalorier>100) {
            return true;
        }  else {
            return false;
        }
    }

    @Override
    public int kalorieriAlt() {
        return kalorier;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getKalorier() {
        return kalorier;
    }

    public void setKalorier(int kalorier) {
        this.kalorier = kalorier;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }
}

