import java.util.Scanner;

public class app {

  public static void main(String[] args) {

    try (Scanner tecladoScanner = new Scanner(System.in)) {
      System.out.println("Entre com o preço de fábrica: ");
      double precoFabrica = tecladoScanner.nextDouble();

      System.out.println("Entre com o percentual do lucro da distribuidora: ");
      double lucroDist = tecladoScanner.nextDouble();
      double valorPercentualLucro = lucroDist * precoFabrica / 100;

      System.out.println("Entre com o percentual dos impostos: ");
      double percentImpostos = tecladoScanner.nextDouble();
      double valorImpostos = percentImpostos * precoFabrica / 100;

      System.out.println("RESPOSTAS");
      System.out.println("Valor Lucro Distribuidora " + valorPercentualLucro);
      System.out.println("Valor Impostos " + valorImpostos);
      System.out.println("Preço final do veículo");
      double precoFinal = valorImpostos + valorPercentualLucro + precoFabrica;
      System.out.println("PREÇO FINAL: " + precoFinal);
    }

  }

}