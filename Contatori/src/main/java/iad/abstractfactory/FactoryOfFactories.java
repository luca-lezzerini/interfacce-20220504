package iad.abstractfactory;

public class FactoryOfFactories {

    public static AbstractFactory getFactory(String tipo) {
        return switch (tipo) {
            case "PRV" ->
                new FactoryPrivati();
            case "AZI" ->
                new FactoryAziende();
            case "NOP" ->
                new FactoryNoProfit();
            default ->
                throw new RuntimeException();
        };
    }
}
