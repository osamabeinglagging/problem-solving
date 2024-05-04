import java.util.*;

public class Stones{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    char[] c = s.next().toCharArray();

    int r = 0;
    for(int j = 1; j < n; j++){
      if(c[j] == c[j-1]) r++;
    }

    System.out.println(r);
  }
}
