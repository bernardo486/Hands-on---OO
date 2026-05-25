package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Carlos");
        fila.add("Maria");
        fila.add("Joao");
        fila.add("Ana");
        fila.add("Pedro");

        System.out.println("Proximo cliente:");
        System.out.println(fila.peek());

        fila.poll();
        fila.poll();

        System.out.println("Fila atualizada:");

        for (String cliente : fila) {

            System.out.println(cliente);

        }

    }

}
