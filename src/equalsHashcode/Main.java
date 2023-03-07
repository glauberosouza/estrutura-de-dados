package equalsHashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Carro> listaDeCarro = new ArrayList<>();

        listaDeCarro.add(new Carro("Ferrari"));
        listaDeCarro.add(new Carro("Ford"));

        System.out.println(listaDeCarro.contains(new Carro("Ferrari")));
        System.out.println((new Carro("Ferrari").hashCode()));

        Carro carroA = new Carro("Ferrari");
        Carro carroB = new Carro("Ford");
        System.out.println(carroA.equals(carroB));
    }
}