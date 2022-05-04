package com.iad.contatoricalore;

import java.util.List;

public class Contabilizzazione {

    public void contabilizza(List<? extends Contabilizzabile> letture) {

        int somma = 0;
        int valorePrecedente = letture.get(0).getValore();
        for (int i = 1; i < letture.size(); i++) {
            int valoreAttuale = letture.get(i).getValore();
            int diff = valoreAttuale - valorePrecedente;
            somma += diff;
            valorePrecedente = valoreAttuale;
        }
        System.out.println("Il totale è " + somma);
    }
}
