package iad.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {

    public static void main(String[] args) {
        AbstractFactory f1 = FactoryOfFactories.getFactory("NOP");

        List<Cliente> clienti = new ArrayList<>();
        List<ContoCorrente> conti = new ArrayList<>();

        Cliente cliente = f1.createCliente();
        cliente.setNome("EMERGENCY");
        clienti.add(cliente);
        ContoCorrente cc = f1.createConto();
        conti.add(cc);
        cliente = f1.createCliente();
        cliente.setNome("AMNESTY INTERNATIONAL");
        clienti.add(cliente);
        cc = f1.createConto();
        conti.add(cc);
    }

}
