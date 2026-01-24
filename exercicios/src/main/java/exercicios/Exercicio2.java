package exercicios;
/**
 * 2. Faça um programa em Java que receba dois números
 *      e ao final mostre a soma, subtração, multiplicação
 *      e a divisão dos números lidos.
 *
 *      @author Sana
 *      @since 23/01/2026
*/

//Declara a classe
public class Exercicio2 {

    //Declara o método principal
    public static void main(String [] args) {

        //Declara as variaveis e atribui os valores
        double num1 = 9;
        double num2 = 4;

        //Chama o método e passa os parametros
        Resultado resultado = calcula(num1, num2);

        //Chama o método de imprimir e passa os parametros
        imprimir(resultado);

    }

    /**
     * Realiza as operações matemáticas
     *
     * @param primeiro
     * @param segundo
     */
    public static Resultado calcula(double primeiro, double segundo){
        //Declara as variaveis e atribui os valores vindos por parametros e sendo calculados
        double soma = primeiro + segundo;
        double subtracao = primeiro - segundo;
        double divisao = primeiro / segundo;
        double multiplicacao = primeiro * segundo;

        //Cria um record somente para fins de aprendizado de como utilizar um record
        return new Resultado(primeiro, segundo, soma, subtracao, multiplicacao, divisao);
    }

    //Declara o método de imprimir e seus parametros esperados
    private static void imprimir(Resultado resultado) {
        //Imprime na tela as variaveis
        System.out.println("O primeiro numero é: "+ resultado.primeiro +" e o segundo numero é: "+ resultado.segundo);
        System.out.println("Soma = "+ resultado.soma);
        System.out.println("Subtração = "+ resultado.subtracao);
        System.out.println("Divisão = "+ resultado.divisao);
        System.out.println("Multiplicação = "+ resultado.multiplicacao);
    };

    public record Resultado(double primeiro, double segundo, double soma, double subtracao, double multiplicacao, double divisao){}
}
