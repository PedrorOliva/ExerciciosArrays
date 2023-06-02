import java.util.Scanner;

public class ExercicioSeis {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int numero = inputUsuario.nextInt();

    if(numero % 5 == 0 && numero % 7 == 0){
      System.out.println("O número " + numero + " é múltiplo de 5 e 7.");
    } else {
      System.out.println("O número " + numero + " não é múltiplo de 5 e 7.");
    }
  }
}
