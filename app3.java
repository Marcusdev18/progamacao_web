import java.util.Scanner;

   public class app3 {
         public static void main(String[] args) {  
         try (Scanner teclado = new Scanner (System.in)) {
            int peso, racao, resto;
            System.out.println("quantos quilogramas tem o saco de ração?");
            peso = teclado.nextInt();
            System.out.println("quantas gramas de ração os gatos devem receber?");
            racao = teclado.nextInt();
            resto = peso * 1000 - racao * 10;
         }
         
         System.out.println("A quantidade de ração que restará após 5 dias é: " + resto + "g");
   }
}