// Crie um programa para exibir a soma de 20 números usando uma matriz.

import java.util.Random;

public class ExercicioNove {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[4][5];
    int soma = 0;

    System.out.println("Preenchendo a matriz randomicamente");

    for(int l = 0; l < matriz.length; l++){
      for (int c = 0; c <matriz.length; c++){
        matriz[l][c] = random.nextInt(99);
      }
    }
    for(int l = 0; l < matriz.length; l++){
      for(int c = 0; c < matriz[l].length; c++){
        System.out.print(matriz[l][c] + " | ");
      }
      System.out.println();
    }
    for(int l = 0; l < matriz.length; l++){
      for(int c = 0; c < matriz[l].length; c++){
        soma = soma + matriz[l][c];
      }

    }
    System.out.println("\n"+soma);
  }
}
