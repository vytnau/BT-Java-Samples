package lt.bt.java.tasks.sviesuoliuMiestas;

import lt.bt.java.tasks.sviesuoliuMiestas.data.Gyventojas;
import lt.bt.java.tasks.sviesuoliuMiestas.data.Prenumeratos;

import java.util.List;

public class Skaiciavimai {

    public void gyventojuPrenumeratuSumos(List<Gyventojas> gyventojai, Prenumeratos prenumeratos){
        for(Gyventojas gyventojas : gyventojai){
            double suma = prenumeratosSuma(gyventojas, prenumeratos);
            Utils.rasytiRezultatus(gyventojas.getVardas() + suma, MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
            System.out.println(gyventojas.getVardas() + suma);
        }
    }

    private double prenumeratosSuma(Gyventojas gyventojas, Prenumeratos pastinkPrenumeratos){
        double suma = 0;
        for(int i = 0; i < gyventojas.getPrenumerata().size(); i++){
            suma += gyventojas.getPrenumerata().get(i) * pastinkPrenumeratos.getLeidiniuKaina().get(i);
        }
        return suma;
    }

    public void leidiniamsIsVisoIsleista(List<Gyventojas> gyventojai, Prenumeratos prenumeratos){
        double suma = 0;
        for(Gyventojas gyventojas : gyventojai){
            suma += prenumeratosSuma(gyventojas, prenumeratos);
        }
        Utils.rasytiRezultatus(String.valueOf(suma), MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
        System.out.println(suma);
    }

    public void daugiausiaiLeidiniuUzsiprenumeravo(List<Gyventojas> gyventojai){
        Gyventojas maxGyv = null;
        int max = 0;
        boolean first = true;
        for(Gyventojas gyventojas : gyventojai){
            int tmp = 0;
            for(int prenumerata : gyventojas.getPrenumerata()){
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
        Utils.rasytiRezultatus(maxGyv.getVardas() + " " + max, MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
        System.out.println(maxGyv.getVardas() + " " + max);
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
        Utils.rasytiRezultatus(minGyv.getVardas() + " " + min, MainSviesuoliuMiestas.REZULTATU_FAILAS, true);
        System.out.println(minGyv.getVardas() + " " + min);
    }

}
