import java.util.*;

public class Soldiers{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int money = s.nextInt();
    int n = s.nextInt();

    System.out.println(Math.max(0, (n * (2 * a + (n - 1) * a) / 2) - money));
  }
}
