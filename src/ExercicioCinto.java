// Criar um programa que calcule a média de salários de uma empresa,
// pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioCinto {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    Map<String, Double> quadroFuncionarios = new HashMap<>();

    System.out.println("Quantidade de funcionários: ");
    int qtdFunc = inputUsuario.nextInt();

    for(int i = 0; i < qtdFunc; i++) {
      System.out.println("Nome: ");
      String nome = inputUsuario.next();
      System.out.println("Salário: ");
      double salario = inputUsuario.nextDouble();
      quadroFuncionarios.put(nome, salario);
    }

    double soma = quadroFuncionarios.values().stream().mapToDouble(Double::doubleValue).sum();
    double media = soma / qtdFunc;
    System.out.println("\nMédia salarial: R$" + media);
  }
}
