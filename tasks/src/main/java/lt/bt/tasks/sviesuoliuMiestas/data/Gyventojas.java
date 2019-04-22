package lt.bt.tasks.sviesuoliuMiestas.data;

import java.util.List;

public class Gyventojas {
    private String vardas;
    private List<Integer> prenumeratos;

    public Gyventojas(String vardas, List<Integer> prenumeratos){
        this.vardas = vardas;
        this.prenumeratos = prenumeratos;
    }

    public String getVardas() {
        return vardas;
    }

    public List<Integer> getPrenumeratos() {
        return prenumeratos;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(vardas).append(" ");
        for(int prenumerata : this.prenumeratos){
            sb.append(prenumerata).append(" ");
        }
        return sb.toString();
    }
}
