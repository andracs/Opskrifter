package opskrifter; /**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/12/2020
 */

public class Ingrediens implements KalorieBeregner {
    private String navn;
    private int kalorier;
    private Diet diet = null;

    public Ingrediens(String navn, int kalorier) {
        this.navn = navn;
        this.kalorier = kalorier;
        System.out.println("opskrifter.Ingrediens er oprettet: " + navn);
    }

    public boolean rigPaaKalorier() {
        if (kalorier>100) {
            return true;
        }  else {
            return false;
        }
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


    @Override
    public int kalorieriAlt() {
        return kalorier;
    }
}

