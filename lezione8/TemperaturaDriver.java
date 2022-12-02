import java.util.Scanner;

public class TemperaturaDriver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int selezione = 0;
    do {
      selezione = ConvertiTemperatura.scelta();
      if (selezione == 3) {
        input.close();
        return;
      }
      System.out.println("Inserire temperatura");
      double t = input.nextDouble();
      if (selezione == 1) {
        System.out.println(ConvertiTemperatura.convFtoC(t));
      } else if (selezione == 2) {
        System.out.println(ConvertiTemperatura.convCtoF(t));
      }
    } while (true);
  }
}
