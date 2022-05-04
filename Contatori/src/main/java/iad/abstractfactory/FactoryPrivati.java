package iad.abstractfactory;

public class FactoryPrivati implements AbstractFactory {

    @Override
    public Cliente createCliente() {
        return new ClientePrivato();
    }

    @Override
    public ContoCorrente createConto() {
        return new CCPrivato();
    }

}
