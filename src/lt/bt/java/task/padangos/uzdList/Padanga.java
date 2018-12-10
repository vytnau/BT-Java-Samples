package lt.bt.java.task.padangos.uzdList;

public class Padanga {

    private int plotis=0;
    private int aukstis=0;
    private String greit;
    private double kaina=0;

    int getPlotis() {
        return plotis;
    }
    void setPlotis(int plotis) {
        this.plotis = plotis;
    }

    int getAukstis() {
        return aukstis;
    }
    void setAukstis(int aukstis) {
        this.aukstis = aukstis;
    }

    String getGreit() {
        return greit;
    }
    void setGreit(String greit) {
        this.greit = greit;
    }

    double getKaina() {
        return kaina;
    }
    void setKaina(double kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString(){
        return plotis+" "+aukstis+" "+greit+" "+kaina;
    }
}
