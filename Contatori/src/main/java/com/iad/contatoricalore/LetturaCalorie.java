package com.iad.contatoricalore;

import java.time.LocalDate;

public class LetturaCalorie implements Contabilizzabile {

    private LocalDate data;
    private int valore;

    public LetturaCalorie(LocalDate data, int valore) {
        this.data = data;
        this.valore = valore;
    }

    @Override
    public int getValore() {
        return valore;
    }
}
