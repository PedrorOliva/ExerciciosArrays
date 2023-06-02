import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Escreva um programa para remover um elemento específico de uma lista.
public class ExercicioUm {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);

    System.out.println("Lista -> : " + numeros);

    System.out.println("Qual elemento deseja remover? ");
    int remover = inputUser.nextInt();

    if(remover > numeros.size()) {
      System.out.println("Escolha um número da lista!!");
    }else {
      numeros.remove(remover - 1);
      System.out.println("Lista atualizada -> : " + numeros);
    }








  }
}
