package exercicios;

import java.util.Scanner;

public class Exercicio4 {

    /**
     * Escrever um programa em Java que leia o nome de um vendedor,
     * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
     * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
     * informar o seu nome, o salário fixo e salário no final do mês.
     */

    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = scan.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        String salarioString = scan.nextLine();

        double salario;
        try {
            salario = Double.parseDouble(salarioString);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido!");
            throw new RuntimeException(e);
        }

        System.out.println("Digite o total de vendas do vendedor: ");
        String vendasString = scan.nextLine();

        double vendas;
        try {
            vendas = Double.parseDouble(vendasString);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        //Passo os parametros pra um objeto
        Vendedor vendedor = new Vendedor(nome, salario, vendas);

        //Imprime os dados
        System.out.println(getDadosVendedor(vendedor));

        //Calcula a comissão
        double comissao = getComissao(vendedor);

        System.out.println("Comissão: "+ comissao);
        System.out.println("Salário final: "+ (vendedor.salario() + comissao));
    }

    private static String getDadosVendedor(Vendedor vendedor) {

        return "Nome: "+vendedor.nome()+"\nSalario: "+vendedor.salario()+"\nVendas: "+ vendedor.vendas();
    }

    private static double getComissao(Vendedor vendedor) {
        return vendedor.vendas() * 0.15;
    }
}
record Vendedor(String nome, double salario, double vendas){}

