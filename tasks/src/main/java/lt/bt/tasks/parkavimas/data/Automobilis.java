package lt.bt.tasks.parkavimas.data;

import java.util.Date;

public class Automobilis extends BaseData {
    private String marke;
    private String zona;
    private Date dataNuo;
    private Date dataIKi;

    public Automobilis(String marke, String valstNr, String zona, Date dataNuo, Date dataIki) {
        super(valstNr);
        this.marke = marke;
        this.dataIKi =dataIki;
        this.dataNuo = dataNuo;
        this.zona = zona;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Date getDataNuo() {
        return dataNuo;
    }

    public void setDataNuo(Date dataNuo) {
        this.dataNuo = dataNuo;
    }

    public Date getDataIKi() {
        return dataIKi;
    }

    public void setDataIKi(Date dataIKi) {
        this.dataIKi = dataIKi;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(marke).append(" ").append(getValstNr()).append(" ").append(zona).append(" ").append(dataNuo).append(" ").append(dataIKi);
        return sb.toString();
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
