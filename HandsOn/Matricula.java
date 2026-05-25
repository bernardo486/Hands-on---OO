package matricula;

import java.util.HashMap;
import java.util.Scanner;

public class Matricula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Joao");
        alunos.put(2, "Maria");
        alunos.put(3, "Pedro");

        System.out.print("Digite a matricula para buscar: ");
        int busca = sc.nextInt();

        if (alunos.containsKey(busca)) {

            System.out.println("Aluno encontrado: " + alunos.get(busca));

        } else {

            System.out.println("Aluno nao encontrado");

        }

        System.out.print("Digite a matricula para remover: ");
        int remover = sc.nextInt();

        alunos.remove(remover);

        System.out.println("Lista de alunos:");

        for (Integer matricula : alunos.keySet()) {

            System.out.println(matricula + " - " + alunos.get(matricula));

        }

    }

}
