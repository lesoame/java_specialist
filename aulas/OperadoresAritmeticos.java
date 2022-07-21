public class OperadoresAritmeticos {

  public static void main(String[] args) {
    int minhaIdade = 40;
    int suaIdade = 25;

    // Adicao
    int totalIdades = minhaIdade + suaIdade + 100;
    System.out.println("Total das idades: " + totalIdades);

    // Subtracao
    int diferencaIdades = minhaIdade - suaIdade;
    System.out.println("Diferenca das idades: " + diferencaIdades);

    // Multiplicacao
    int dobroDaIdade = 2 * suaIdade;
    System.out.println("Dobro da sua idade: " + dobroDaIdade);

    // Divisao
    int metadeDaIdade = suaIdade / 2;
    System.out.println("Metade da sua idade: " + metadeDaIdade);

    // Modulo
    int restoDivisao = 7 % 2;
    System.out.println("Resto da divisao (modulo): " + restoDivisao);
  }

}
