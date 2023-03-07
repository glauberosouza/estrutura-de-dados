package isSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // O HashSet não segue a ordem conforme adicionado.
        Set<Carro> hashSetCarro = new HashSet<>();

        hashSetCarro.add(new Carro("Ford"));
        hashSetCarro.add(new Carro("Ferrari"));
        hashSetCarro.add(new Carro("Fiat"));
        hashSetCarro.add(new Carro("Peugeot"));


        System.out.println(hashSetCarro);

        //
        Set<Carro> treeSetCarro = new TreeSet<>();
        treeSetCarro.add(new Carro("Ford"));
        treeSetCarro.add(new Carro("Ferrari"));
        treeSetCarro.add(new Carro("Renault"));
        treeSetCarro.add(new Carro("Peugeot"));

        // Só foi possível percorrer, porque implementamos o método Compareble.
        System.out.println(treeSetCarro);
    }
}
