package projetono;

//Encadeamento de nó e Generics
public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("no1");

        // referência apontada:
        No<String> no2 = new No<>("no2");
        no1.setProximono(no2);

        No<String> no3 = new No<>("no3");
        no2.setProximono(no3);

        No<String> no4 = new No<>("no4");
        no3.setProximono(no4);
        // No1 apontando pra no2 -> no3 -> n4 -> Null;

        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no2);

        System.out.println("-------------------");

        // Conceito de encadeamento de nó como exemplo:
        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no1.getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono().getProximono());
    }
}
