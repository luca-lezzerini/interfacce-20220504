package com.iad.interfacce;

public class Forno implements Controllabile {

    static private Forno instance = null;
    
    private Forno() {
    }
    
    public static Forno creaForno(){
        if (instance == null){
            instance = new Forno();
        }
        return instance;
    }

    @Override
    public void setVolume(int vol) {
        System.out.println("Temperatura impostata a gradi C " + vol);
    }

    @Override
    public void setOn(boolean on) {
        System.out.println("Il forno è " + (on ? "acceso" : "spento"));
    }

    @Override
    public void setCanale(String channel) {
        System.out.println("Il forno ora funzionerà in modalità " + channel);
    }

}
