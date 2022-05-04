package com.iad.interfacce;

public class TV implements Controllabile {

    private static TV instance = null;

    private TV() {
    }

    public static TV creaTV() {
        if (instance == null) {
            instance = new TV();
        }
        return instance;
    }

    @Override
    public void setVolume(int vol) {
        System.out.println("Il volume ora è " + vol);
    }

    @Override
    public void setOn(boolean on) {
        if (on) {
            System.out.println("Acceso");
        } else {
            System.out.println("Spento");
        }
    }

    @Override
    public void setCanale(String channel) {
        System.out.println("Siamo sul canale " + channel);
    }

}
