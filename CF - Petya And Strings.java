import java.util.Scanner;

public class PetyaAndStrings{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String s1 = s.nextLine().toUpperCase();
    String s2 = s.nextLine().toUpperCase();
    int res = s1.compareTo(s2);
    System.out.println(res == 0 ? 0 : res / Math.abs(res));
  }
}
