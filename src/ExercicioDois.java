// Escreva um programa para inserir um elemento (posição específica) em uma lista.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    List<Integer> numeros = new ArrayList<>(10);

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(6);
    numeros.add(7);
    numeros.add(8);
    numeros.add(9);
    numeros.add(10);

    System.out.println("Lista -> : " + numeros + "\n");

    System.out.println("Escolha a posição no índex e o número que deseja adicionar: ");
    int index = inputUsuario.nextInt();
    int numero = inputUsuario.nextInt();

    System.out.println("Adicionando número " + numero + " no índex " + index);
    numeros.add(index, numero);

    System.out.println("Lista atualizada -> : " + numeros);

  }
}
