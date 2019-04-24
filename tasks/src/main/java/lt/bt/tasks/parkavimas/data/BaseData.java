package lt.bt.tasks.parkavimas.data;

public abstract class BaseData {
    private String valstNr;

    protected BaseData(String valstNr) {
        this.valstNr = valstNr;
    }

    public String getValstNr() {
        return valstNr;
    }

    public void setVatlsNr(String valstNr){
        this.valstNr = valstNr;
    }
}
