import java.util.Scanner;

public class Capitalize{
  public static void main(String[] args){
    char[] a = new Scanner(System.in).next().toCharArray();
    a[0] = Character.toUpperCase(a[0]);
    /*
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]);
    }
    */
    System.out.println(String.valueOf(a));
  }
}
