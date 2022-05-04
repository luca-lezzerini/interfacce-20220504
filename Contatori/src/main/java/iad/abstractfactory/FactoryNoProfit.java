package iad.abstractfactory;

public class FactoryNoProfit implements AbstractFactory {

    @Override
    public Cliente createCliente() {
        return new ClienteNoProfit();
    }

    @Override
    public ContoCorrente createConto() {
        return new CCNoProfit();
    }

}
