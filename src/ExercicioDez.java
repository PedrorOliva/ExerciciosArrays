// Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e
// escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.

public class ExercicioDez {
  public static void main(String[] args) {
    int soma = 0;
    int impar = 0;
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for(int i = 0; i < numeros.length; i++){
      if(i / 2 != 0){
        soma += i;
        impar++;
      }
    }
    double media = soma / impar;
    System.out.println("Média aritmécia dos elementos ímpares: " + media);

  }
}
