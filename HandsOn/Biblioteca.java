package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    livros.add(new Livro(codigo, titulo, autor));

                    System.out.println("Livro cadastrado!");

                    break;

                case 2:

                    System.out.println("\nLista de livros:");

                    for (Livro l : livros) {

                        System.out.println(
                                l.codigo + " - "
                                + l.titulo + " - "
                                + l.autor + " - "
                                + (l.disponivel ? "Disponivel" : "Emprestado")
                        );

                    }

                    break;

                case 3:

                    System.out.print("Codigo do livro: ");
                    int emp = sc.nextInt();

                    for (Livro l : livros) {

                        if (l.codigo == emp) {

                            if (l.disponivel) {

                                l.disponivel = false;
                                System.out.println("Livro emprestado!");

                            } else {

                                System.out.println("Livro indisponivel!");

                            }

                        }

                    }

                    break;

                case 4:

                    System.out.print("Codigo do livro: ");
                    int dev = sc.nextInt();

                    for (Livro l : livros) {

                        if (l.codigo == dev) {

                            l.disponivel = true;

                            System.out.println("Livro devolvido!");

                        }

                    }

                    break;

            }

        } while (opcao != 0);

    }

}
