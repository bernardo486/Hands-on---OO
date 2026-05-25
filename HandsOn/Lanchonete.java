package lanchonete;
import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status");
            System.out.println("4 - Buscar pedido");
            System.out.println("5 - Valor total");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Numero do pedido: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome do cliente: ");
                    String cliente = sc.nextLine();

                    System.out.print("Item pedido: ");
                    String item = sc.nextLine();

                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();

                    pedidos.add(new Pedido(numero, cliente, item, valor));

                    System.out.println("Pedido cadastrado!");

                    break;

                case 2:

                    System.out.println("\nLista de pedidos:");

                    for (Pedido p : pedidos) {

                        System.out.println(
                                p.numero + " - " +
                                p.cliente + " - " +
                                p.item + " - R$" +
                                p.valor + " - " +
                                p.status
                        );

                    }

                    break;

                case 3:

                    System.out.print("Numero do pedido: ");
                    int busca = sc.nextInt();
                    sc.nextLine();

                    for (Pedido p : pedidos) {

                        if (p.numero == busca) {

                            System.out.println("Novo status:");
                            System.out.println("PENDENTE");
                            System.out.println("PREPARANDO");
                            System.out.println("FINALIZADO");

                            p.status = sc.nextLine();

                            System.out.println("Status atualizado!");

                        }

                    }

                    break;

                case 4:

                    System.out.print("Numero do pedido: ");
                    int procurar = sc.nextInt();

                    for (Pedido p : pedidos) {

                        if (p.numero == procurar) {

                            System.out.println(
                                    p.numero + " - " +
                                    p.cliente + " - " +
                                    p.item + " - " +
                                    p.status
                            );

                        }

                    }

                    break;

                case 5:

                    double total = 0;

                    for (Pedido p : pedidos) {

                        total += p.valor;

                    }

                    System.out.println("Valor total: R$" + total);

                    break;

            }

        } while (opcao != 0);

    }

}