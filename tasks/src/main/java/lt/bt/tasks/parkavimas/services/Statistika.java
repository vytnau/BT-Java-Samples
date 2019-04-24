package lt.bt.tasks.parkavimas.services;

import lt.bt.tasks.parkavimas.data.Automobilis;
import lt.bt.tasks.parkavimas.data.Zona;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistika {
    public void automobiliuStatistika(List<Automobilis> automobiliai, Map<String, Zona> zonos){
        Map<String, Statistika> statistika = new HashMap<>();
        automobiliai.stream().forEach(a -> {
            
        });
        //TODO implement
    }


}

