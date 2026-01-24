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
        int num1 = 9;
        int num2 = 4;

        //Chama o método e passa os parametros
        calcula(num1, num2);

    }

    /**
     * Realiza as operações matemáticas
     *
     * @param primeiro
     * @param segundo
     */
    public static void calcula(int primeiro, int segundo){
        //Declara as variaveis e atribui os valores vindos por parametros e sendo calculados
        int soma = primeiro + segundo;
        int subtracao = primeiro - segundo;
        int divisao = primeiro / segundo;
        int multiplicacao = primeiro * segundo;

        //Cria um record somente para fins de aprendizado de como utilizar um record
        Resultado resultado = new Resultado(primeiro, segundo, soma, subtracao, multiplicacao, divisao);

        //Chama o método de imprimir e passa os parametros
        imprimir(resultado);
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

    public record Resultado(int primeiro, int segundo, int soma, int subtracao, int multiplicacao, int divisao){}
}
