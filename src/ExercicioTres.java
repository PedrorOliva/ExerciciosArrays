import java.util.*;

// Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).
public class ExercicioTres {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    List<Integer> numeros = new ArrayList<>(2);

    System.out.println("Informe 2 números: ");
    int numero1 = inputUsuario.nextInt();
    int numero2 = inputUsuario.nextInt();

    if(numero1 == numero2) {
      System.out.println("Os números não podem ser iguais!!");
    } else {
      numeros.add(numero1);
      numeros.add(numero2);
      Collections.sort(numeros, Collections.reverseOrder());
      System.out.println(numeros);
    }
  }
}
