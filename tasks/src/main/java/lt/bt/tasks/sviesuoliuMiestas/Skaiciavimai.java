package lt.bt.tasks.sviesuoliuMiestas;

import lt.bt.tasks.sviesuoliuMiestas.data.Gyventojas;
import lt.bt.tasks.sviesuoliuMiestas.data.Prenumeratos;

import java.text.DecimalFormat;
import java.util.List;

public class Skaiciavimai {
    private DecimalFormat df;
    public Skaiciavimai(){
        df = new DecimalFormat("0.00");
    }

    public void spausdintiGyventojuPrenumeratuSumas(List<Gyventojas> gyventojai, Prenumeratos prenumeratos){
        for(Gyventojas gyventojas : gyventojai){
            StringBuilder sb = new StringBuilder();
            double suma = prenumeratosSuma(gyventojas, prenumeratos);
            sb.append(gyventojas.getVardas()).append(" ").append(df.format(suma));
            Utils.rasytiRezultatus(sb.toString(), MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
            System.out.println(sb.toString());
        }
    }

    private double prenumeratosSuma(Gyventojas gyventojas, Prenumeratos pastinkPrenumeratos){
        double suma = 0d;
        for(int i = 0; i < gyventojas.getPrenumeratos().size(); i++){
            suma += gyventojas.getPrenumeratos().get(i) * pastinkPrenumeratos.getLeidiniuKaina().get(i);
        }
        return suma;
    }

    public void leidiniamsIsVisoIsleista(List<Gyventojas> gyventojai, Prenumeratos prenumeratos){
        double suma = 0;
        for(Gyventojas gyventojas : gyventojai){
            suma += prenumeratosSuma(gyventojas, prenumeratos);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(df.format(suma));
        Utils.rasytiRezultatus(sb.toString(), MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
        System.out.println(sb.toString());
    }

    public void daugiausiaiLeidiniuUzsiprenumeravo(List<Gyventojas> gyventojai){
        Gyventojas maxGyv = null;
        int max = 0;
        boolean first = true;
        for(Gyventojas gyventojas : gyventojai){
            int tmp = 0;
            for(int prenumerata : gyventojas.getPrenumeratos()){
                tmp += prenumerata;
            }
            if(first){
                max = tmp;
                maxGyv = gyventojas;
                first = false;
            } else {
                if(max < tmp) {
                    max = tmp;
                    maxGyv = gyventojas;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(maxGyv.getVardas()).append(" ").append(df.format(max));
        Utils.rasytiRezultatus(sb.toString(), MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
        System.out.println(sb.toString());
    }

    public void prenumerataUzMaziausiaSuma(List<Gyventojas> gyventojai, Prenumeratos prenumeratos){
        Gyventojas minGyv = null;
        double min = 0;
        boolean first = true;
        for(Gyventojas gyventojas : gyventojai){
            double suma = prenumeratosSuma(gyventojas, prenumeratos);
            if(first){
                min = suma;
                minGyv = gyventojas;
                first = false;
            } else {
                if(min > suma){
                    min = suma;
                    minGyv = gyventojas;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(minGyv.getVardas()).append(" ").append(df.format(min));
        Utils.rasytiRezultatus(sb.toString(), MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
        System.out.println(sb.toString());
    }

}
