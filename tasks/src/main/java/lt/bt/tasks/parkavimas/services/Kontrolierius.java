package lt.bt.tasks.parkavimas.services;

import lt.bt.tasks.parkavimas.data.ParkavimoInfo;

import java.util.Map;

public class Kontrolierius {

    public void pasibaigesParkavimas(Map<String, ParkavimoInfo> parkavimoInfos){
        parkavimoInfos.values().stream().forEach(p -> {
            if(p.getDataIki().getTime() < System.currentTimeMillis()){
                System.out.println("Pasibaige parkavimas: " + p.getValstNr());
            }
        });
    }
}
