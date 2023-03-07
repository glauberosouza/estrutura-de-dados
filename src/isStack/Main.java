package isStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Veiculo> stackVeiculo = new Stack<>();

        stackVeiculo.push(new Veiculo("Ferrari"));
        stackVeiculo.push(new Veiculo("Ford"));
        stackVeiculo.push(new Veiculo("Fiat"));

        System.out.println(stackVeiculo);
        System.out.println(stackVeiculo.pop());
        System.out.println(stackVeiculo);

        System.out.println(stackVeiculo.peek());
        System.out.println(stackVeiculo);

        System.out.println(stackVeiculo.empty());
    }
}
