package iad.abstractfactory;

public class FactoryAziende implements AbstractFactory {

    @Override
    public Cliente createCliente() {
        return new ClienteAzienda();
    }

    @Override
    public ContoCorrente createConto() {
        return new CCAzienda();
    }

}
