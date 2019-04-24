package lt.bt.tasks.parkavimas.data;

public class Statistika {
    private Automobilis automobilis;
    private double sumaUzParkavima;
    private long aisktelejPrastovejo;

    public Statistika(){

    }

    public Automobilis getAutomobilis() {
        return automobilis;
    }

    public void setAutomobilis(Automobilis automobilis) {
        this.automobilis = automobilis;
    }

    public double getSumaUzParkavima() {
        return sumaUzParkavima;
    }

    public void setSumaUzParkavima(double sumaUzParkavima) {
        this.sumaUzParkavima = sumaUzParkavima;
    }

    public long getAisktelejPrastovejo() {
        return aisktelejPrastovejo;
    }

    public void setAisktelejPrastovejo(long aisktelejPrastovejo) {
        this.aisktelejPrastovejo = aisktelejPrastovejo;
    }
}
