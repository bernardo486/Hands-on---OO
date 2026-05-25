package chamada;import java.util.HashSet;

public class Chamada {

    public static void main(String[] args) {

        HashSet<String> alunos = new HashSet<>();

        alunos.add("Joao");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("Maria");
        alunos.add("Joao");
        alunos.add("Ana");
        alunos.add("Bernardo");

        System.out.println("Lista de alunos presentes:");

        for(String nome : alunos){

            System.out.println(nome);

        }

        System.out.println("Quantidade de alunos presentes: " + alunos.size());

    }

}
