import java.util.Scanner;

public class ConvertiTemperatura {
  public static int scelta() {
    Scanner input = new Scanner(System.in);
    int scelta = 0;
    do {
      System.out.println("Conversioni possibili");
      System.out.println("1) F -> C");
      System.out.println("2) C -> F");
      System.out.println("3) Uscita");
      scelta = input.nextInt();
    } while (scelta < 1 || scelta > 3);
    input.close();
    return scelta;
  }

  public static double convFtoC(double t) {
    return ((t - 32) / 1.8);
  }

  public static double convCtoF(double t) {
    return (t * 1.8 + 32);
  }
}
