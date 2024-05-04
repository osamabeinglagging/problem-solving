import java.util.Arrays;
import java.util.Scanner;

public class Math{
  public static void main(String[] args){
    String[] s = new Scanner(System.in).next().split("\\+");
    Arrays.sort(s);
    System.out.println(String.join("+", s));
  }
}
