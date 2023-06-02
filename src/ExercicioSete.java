// Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioSete {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();

    System.out.println("Quantos números deseja inserir: ");
    int qndNumeros = inputUsuario.nextInt();

    for(int i = 0; i < qndNumeros; i++){
      System.out.println("Informe um número: ");
      int numero = inputUsuario.nextInt();
      numeros.add(numero);
    }
    Collections.sort(numeros, Collections.reverseOrder());
    System.out.println(numeros);
  }
}
