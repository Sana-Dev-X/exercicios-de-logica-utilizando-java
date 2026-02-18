package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    /**
     * Escrever um programa em Java para determinar o consumo médio de um automóvel
     * sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
     */
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distância percorrida:");
        String distanciaString = scan.nextLine();
        double distancia;
        try {
             distancia = Double.parseDouble(distanciaString);
        }catch (NumberFormatException e){
            System.out.println("Valor inválido");
            throw new RuntimeException(e);
        }

        System.out.println("Digite o total de combustível gasto:");
        String combustivelString = scan.nextLine();
        double combustivel;
        try {
            combustivel = Double.parseDouble(combustivelString);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido");
            throw new RuntimeException(e);
        }
        double consumo = distancia / combustivel;

        System.out.println("O consumo médio do automóvel é: " + consumo+" km/l");


    }

}
