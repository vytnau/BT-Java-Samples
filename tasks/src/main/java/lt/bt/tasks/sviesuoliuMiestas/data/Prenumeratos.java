package lt.bt.tasks.sviesuoliuMiestas.data;

import java.util.List;

public class Prenumeratos {
    private int leidiniuSk;
    private List<Double> leidiniuKaina;

    public Prenumeratos(int leidiniuSk, List<Double> leidiniuKaina){
        this.leidiniuSk = leidiniuSk;
        this.leidiniuKaina = leidiniuKaina;
    }

    public int getLeidiniuSk() {
        return leidiniuSk;
    }

    public void setLeidiniuSk(int leidiniuSk) {
        this.leidiniuSk = leidiniuSk;
    }

    public List<Double> getLeidiniuKaina() {
        return leidiniuKaina;
    }

    public void setLeidiniuKaina(List<Double> leidiniuKaina) {
        this.leidiniuKaina = leidiniuKaina;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(leidiniuSk).append("\n");
        for(Double kaina : leidiniuKaina){
            sb.append(kaina).append(" ");
        }
        return sb.toString();
    }
}
