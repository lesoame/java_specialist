import java.util.Scanner;

public class AvaliacaoAtendimento {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Avalie nosso atendimento (1 a 5): ");
    int nota = entrada.nextInt();

    String descricaoNota;

    switch (nota) {
      case 1:
        descricaoNota = "Muito ruim";
        System.out.println(1);
	break;
      case 2:
        descricaoNota = "Ruim";
        System.out.println(2);
      case 3:
        descricaoNota = "Razoavel";
        System.out.println(3);
      case 4:
        descricaoNota = "Muito bom";
        System.out.println(4);
      case 5:
        descricaoNota = "Excelente";
        System.out.println(5);
      default:
        descricaoNota = "Opcao invalida";
        System.out.println("default");
    }

    System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
  
  }

}