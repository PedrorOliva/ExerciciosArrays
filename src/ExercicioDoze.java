// Ler um vetor A com 20 elementos. Construir dois vetores B e C,
// sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDoze {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    List<Integer> vetorA = new ArrayList<>();
    List<Integer> vetorB = new ArrayList<>();
    List<Integer> vetorC = new ArrayList<>();

    System.out.println("Adicione 20 elementos: ");
    for (int i = 1; i <= 20; i++){

      int elemento = inputUsuario.nextInt();
      vetorA.add(elemento);
    }

    for(int elementos: vetorA) {
      if(elementos % 2 == 0){
        vetorB.add(elementos);
      } else {
        vetorC.add(elementos);
      }
    }
    System.out.println("Vetor A -> : " + vetorA);
    System.out.println("Vetor B -> : " + vetorB);
    System.out.println("Vetor C -> : " + vetorC);
  }
}
