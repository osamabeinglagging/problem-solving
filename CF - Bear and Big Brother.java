import java.util.*;

public class Bear{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int l = s.nextInt();
    int b = s.nextInt();

    int y = 0;
    while(b >= l){
      l *= 3;
      b *= 2;
      y++;
    }
    System.out.println(y);
  }
}
