import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero = 10;

  System.out.println("Digite o número específico: ");
    int num = sc.nextInt();
      if (num != numero) {
      System.out.println("Acesso negado.");
      } else {
        System.out.println("Acesso permitido.");
      }
    sc.close();
  }
}