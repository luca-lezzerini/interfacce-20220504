package com.iad.interfacce;

public class ControllabileFactory {

    public static Controllabile getDevice(int indirizzo) {
        Controllabile dispositivo = switch (indirizzo) {
            case 0 ->
                Forno.creaForno();
            case 1 ->
                TV.creaTV();
            default ->
                throw new UnsupportedOperationException();
        };
                
        return dispositivo;
    }
}
