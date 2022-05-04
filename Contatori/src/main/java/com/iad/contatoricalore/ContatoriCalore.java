package com.iad.contatoricalore;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class ContatoriCalore {

    public static void main(String[] args) {
        List<LetturaCalorie> lista = creaListaLettureCalorie();
        List<LetturaAcqua> listaAcqua = creaListaLettureAcqua();
        List<LetturaContaKm> listaKm = creaListaLettureContaKm();

        // calcola totale calorie
        Contabilizzazione cCalore = new Contabilizzazione();
        cCalore.contabilizza(lista);

        // calcola totale mc acqua
        Contabilizzazione cAcqua = new Contabilizzazione();
        cAcqua.contabilizza(listaAcqua);

        // calcola totale km
        Contabilizzazione cKm = new Contabilizzazione();
        cKm.contabilizza(listaKm);
    }

    private static List<LetturaCalorie> creaListaLettureCalorie() {
        List<LetturaCalorie> lista = new LinkedList<>();
        lista.add(new LetturaCalorie(LocalDate.of(2022, Month.JANUARY, 1), 1234));
        lista.add(new LetturaCalorie(LocalDate.of(2022, Month.FEBRUARY, 1), 2176));
        lista.add(new LetturaCalorie(LocalDate.of(2022, Month.MARCH, 1), 3434));
        lista.add(new LetturaCalorie(LocalDate.of(2022, Month.APRIL, 1), 5356));
        lista.add(new LetturaCalorie(LocalDate.of(2022, Month.MAY, 1), 6001));
        return lista;
    }

    private static List<LetturaAcqua> creaListaLettureAcqua() {
        List<LetturaAcqua> lista = new LinkedList<>();
        lista.add(new LetturaAcqua(LocalDate.of(2022, Month.JANUARY, 1), 789));
        lista.add(new LetturaAcqua(LocalDate.of(2022, Month.FEBRUARY, 1), 940));
        lista.add(new LetturaAcqua(LocalDate.of(2022, Month.MARCH, 1), 1261));
        lista.add(new LetturaAcqua(LocalDate.of(2022, Month.APRIL, 1), 2234));
        lista.add(new LetturaAcqua(LocalDate.of(2022, Month.MAY, 1), 3187));
        return lista;
    }

    private static List<LetturaContaKm> creaListaLettureContaKm() {
        List<LetturaContaKm> lista = new LinkedList<>();
        lista.add(new LetturaContaKm(LocalDate.of(2022, Month.JANUARY, 1), 200));
        lista.add(new LetturaContaKm(LocalDate.of(2022, Month.FEBRUARY, 1), 763));
        lista.add(new LetturaContaKm(LocalDate.of(2022, Month.MARCH, 1), 2239));
        lista.add(new LetturaContaKm(LocalDate.of(2022, Month.APRIL, 1), 3219));
        lista.add(new LetturaContaKm(LocalDate.of(2022, Month.MAY, 1), 4498));
        return lista;
    }
}
