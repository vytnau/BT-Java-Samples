package lt.bt.tasks.parkavimas.data;

public class Zona {
    private String id;
    private double kaina;

    public Zona(String id, double kaina) {
        this.id = id;
        this.kaina = kaina;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ").append(kaina);
        return sb.toString();
    }
}
