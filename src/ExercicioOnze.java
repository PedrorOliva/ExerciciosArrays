// Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
// Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioOnze {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int contador = 0;
    int maiorIdade = 0;
    int menorIdade = 0;

    List<Integer> idades = new ArrayList<>();

    System.out.println("Informe as idades: ");
    while (contador < 10) {
      int idade = inputUsuario.nextInt();
      idades.add(idade);
      if (contador == 0) {
        maiorIdade = idade;
        menorIdade = idade;
      } else if (idade > maiorIdade) {
        maiorIdade = idade;
      } else if (idade < menorIdade){
        menorIdade = idade;
      }
      contador++;
    }
    System.out.println("Maior idade: " + maiorIdade);
    System.out.println("Menor idade: " + menorIdade);
  }
}
