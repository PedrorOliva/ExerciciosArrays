// Crie um programa para exibir todos os inteiros dentro do intervalo 100-150
// cuja soma de todos os dígitos é um número par.

public class ExercicioOito {
  public static void main(String[] args) {
    int d1, d2, d3, soma;
    int numero = 100;

    while (numero <= 150){
      d1 = numero % 10;
      d2 =((numero % 100) / 10);
      d3 = numero / 100;
      soma = d1 + d2 + d3;

      if(soma % 2 == 0){
        System.out.println(numero + " = " + soma);
      }
      numero++;
    }

  }
}
