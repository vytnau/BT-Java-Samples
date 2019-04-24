package lt.bt.tasks.parkavimas.data;

import java.util.Date;

public class ParkavimoInfo extends BaseData {
    private Zona zona;
    private Date dataIki;
    public ParkavimoInfo(String valstNr, Zona zona, Date dataIki) {
        super(valstNr);
        this.zona = zona;
        this.dataIki = dataIki;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Date getDataIki() {
        return dataIki;
    }

    public void setDataIki(Date dataIki) {
        this.dataIki = dataIki;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getValstNr()).append(" ").append(zona.getId()).append(" ").append(dataIki);
        return sb.toString();
    }
}
