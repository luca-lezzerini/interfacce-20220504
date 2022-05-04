package com.iad.interfacce;

public class EsercizioControllabili {

    public static void main(String[] args) {
        // forno statico 60
        Controllabile cx = ControllabileFactory.getDevice(0);
        cx.setCanale("statico");
        cx.setVolume(60);
        cx.setOn(true);
        
        // canale 5 volume 10
        Controllabile ab = ControllabileFactory.getDevice(1);
        ab.setCanale("Canale 5");
        ab.setVolume(10);
        ab.setOn(true);
        
        // forno spento
        Controllabile ac = ControllabileFactory.getDevice(0);
        ac.setOn(false);
        
        // canale 1
        Controllabile xy = ControllabileFactory.getDevice(1);
        xy.setCanale("Rai 1");
        xy.setOn(true);
    }
    
}
