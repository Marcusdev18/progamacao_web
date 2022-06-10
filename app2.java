import java.util.Scanner;

public class app2 {
   private static Object salfin;

   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         double hr, pct, hrtab, salb, imp, salfin;
         int sal;
         System.out.println("Digite o valor de horas trabalhadas: ");
         hr = teclado.nextDouble();
         sal = 1212;
         hrtab = sal / 2;
         salb = hr * hrtab;
      }
      double salb;
      Object imp = salb * 0.03;
       salfin = salb - imp;
      System.out.println("O valor do salário é: " + salfin);
   }
}