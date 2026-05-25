
package medianotas;
import java.util.ArrayList;

public class MediaNotas {


    public static void main(String[] args) {
       

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);

        double soma = 0;

        for(double nota : notas){

            soma += nota;

        }

        double media = soma / notas.size();

        System.out.println("Media da turma: " + media);

        if(media >= 7){

            System.out.println("Turma aprovada");

        }else{

            System.out.println("Turma reprovada");

        }

    }

}


    
