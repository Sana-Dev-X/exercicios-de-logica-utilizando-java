package exercicios;

/**
 * 1.Faça um programa em Java que receba dois números e exiba o resultado da sua soma.
 *
 * @author Sana
 * @since 23/01/2026
 */


public class Exercicio1{
    public static void main(String [] args){

        //Declara e atribui valor as variaveis
        int valor1 = 8;
        int valor2 = 1;

        //Exibe diretamente a soma dos dois numeros
        System.out.println("Primeiro número somado ao segundo número é igual: " + (valor1+valor2));

        //Chama o metodo declarado
        imprimeOla();
    }

    //Declarar metodo
    public static void imprimeOla(){
        System.out.println("Olá!");
    }
}