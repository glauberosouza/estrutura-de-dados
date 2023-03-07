package isqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Fiat"));
        queueCarro.add(new Carro("Ferrari"));

        System.out.println(queueCarro.add(new Carro("Peugeot")));
        System.out.println(queueCarro);

        // O offer retorna false se ele não conseguir executar, diferente do add que
        // volta um erro
        System.out.println(queueCarro.offer(new Carro("Renault")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);

        System.out.println(queueCarro.poll());
        System.out.println(queueCarro);

        System.out.println(queueCarro.isEmpty());
    }
}
