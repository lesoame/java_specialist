import java.util.Scanner;

public class HorarioFuncionamento2 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    System.out.print("Dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();

    System.out.print("Mes: ");
    int mes = entrada.nextInt();
  
    // switch expression
    /*  
    String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> "Fechado";
      case "ter", "qua", "qui", "sex" -> "08:00 as 21:00";
      case "sab", "dom" -> "08:00 as 12:00";
      default -> "Dia invalido";
    };
    */
 
    System.out.printf("Horario de funcionamento: %s%n", switch (diaSemana) {
      case "seg" -> {
        if (mes == 12) {
          yield "08:00 as 16:00";
        }
        yield "Fechado";
      }
      case "ter", "qua", "qui", "sex" -> "08:00 as 21:00";
      case "sab", "dom" -> "08:00 as 12:00";
      default -> "Dia invalido";
    });

    /*
    String horarioFuncionamento;
    switch (diaSemana) {
      case "seg" -> horarioFuncionamento = "Fechado";
      case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 as 21:00";
      case "sab", "dom" -> horarioFuncionamento = "08:00 as 12:00";
      default -> horarioFuncionamento = "Dia invalido";
    }  
    */  
    //System.out.printf("Horario de funcionamento: %s%n", horarioFuncionamento);
 
  }

}