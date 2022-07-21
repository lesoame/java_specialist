public class AulaVariaveis {

  public static void main(String[] args) {
    // não recomendado pela Code Conventions da Oracle
    //int minhaIdade = 40, suaIdade = 25;

    // sempre usar lowerCamelCase na declaração de variáveis  
    int minhaIdade = 40;
    int suaIdade = 25;
    int totalIdades = minhaIdade + suaIdade;

    System.out.println("Total das idades: " + totalIdades);
  }

}