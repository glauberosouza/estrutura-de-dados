package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome:", "João");
        aluno.put("Idade:", "31");
        aluno.put("Media:", "9.5");
        aluno.put("Turma:", "3a");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
        List<Map<String, String>> listAluno = new ArrayList<>();
        
        listAluno.add(aluno);
        

        Map<String, String> aluno2 = new HashMap<>();
        
        listAluno.add(aluno2);

        aluno2.put("Nome:", "Henrique");
        aluno2.put("Idade:", "22");
        aluno2.put("Media:", "9.5");
        aluno2.put("Turma:", "2a");

        System.out.println(listAluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
    }
}