import java.util.Scanner;

public class app4 {
   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         int cod, sal, neo_sal;
         System.out.println("digite o número de código(1 á 5)");
         cod = teclado.nextInt();
         System.out.println("qual o valor do salário atual?");
         sal = teclado.nextInt();
         switch (cod) {
            case 1:
               neo_sal = (int) (sal + sal * 0.5);
               System.out.println(" Escriturário \n Valor do aumento: 50% \n novo salário: " + neo_sal);
               break;
            case 2:
               neo_sal = (int) (sal + sal * 0.35);
               System.out.println(" Secretário \n Valor do aumento: 35% \n novo salário: " + neo_sal);
               break;
            case 3:
               neo_sal = (int) (sal + sal * 0.2);
               System.out.println(" Caixa \n Valor do aumento: 20% \n novo salário: " + neo_sal);
               break;
            case 4:
               neo_sal = (int) (sal + sal * 0.1);
               System.out.println(" Gerente \n Valor do aumento: 10% \n novo salário: " + neo_sal);
               break;
            case 5:
               neo_sal = (int) sal;
               System.out.println(" Diretor \n Valor do aumento: 0% \n novo salário: " + neo_sal);
               break;
            default:
               System.out.println("Código inválido");
         }
      }
   }
}