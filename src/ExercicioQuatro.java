/*
* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
* Fazer um algoritmo que calcule e escreva:
* - a maior e a menor altura do grupo;
* - média de altura dos homens;
* - o número de mulheres.
* */

import java.util.Scanner;

public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    int conjunto = 10;
    double maiorAltura = 0;
    double menorAltura = 0;
    int contador = 0;
    int totalMasculino = 0;
    int totalFeminino = 0;

    while (contador < 10) {
      System.out.println("Informe o sexo: ");
      String sexo = inputUsuario.next();
      System.out.println("Informe a altura: ");
      double altura = inputUsuario.nextDouble();

      if(contador == 0) {
        maiorAltura = altura;
        menorAltura = altura;
      } else if (altura > maiorAltura) {
        maiorAltura = altura;
      } else if (altura < menorAltura) {
        menorAltura = altura;
      }
      contador++;

      if (sexo.equalsIgnoreCase("masculino")) {
        totalMasculino += altura;
      } else if(sexo.equalsIgnoreCase("feminino")){
        totalFeminino++;
      }

    }
    double media = totalMasculino / conjunto;

    System.out.println("A maior altura: " + maiorAltura + " e a menor altura: " + menorAltura);
    System.out.println("A média de altura dos homens: " + media);
    System.out.println("O total de mulheres: " + totalFeminino);
  }
}
