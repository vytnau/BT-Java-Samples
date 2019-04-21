package lt.bt.java.tasks.sviesuoliuMiestas.data;

import java.util.List;

public class Gyventojas {
    private String vardas;
    private List<Integer> prenumerata;

    public Gyventojas(String vardas, List<Integer> prenumerata){
        this.vardas = vardas;
        this.prenumerata = prenumerata;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public List<Integer> getPrenumerata() {
        return prenumerata;
    }

    public void setPrenumerata(List<Integer> prenumerata) {
        this.prenumerata = prenumerata;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(vardas).append(" ");
        for(int prenumerata : this.prenumerata){
            sb.append(prenumerata).append(" ");
        }
        return sb.toString();
    }
}
