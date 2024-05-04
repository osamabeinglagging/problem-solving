import java.util.*;

public class Words{
  public static void main(String[] args){
    String word = new Scanner(System.in).next();
    int dec = 0;
    for(int i = 0; i < word.length(); i++){
      if(Character.isUpperCase(word.charAt(i)))
          dec++;
      else
          dec--;
    }
    if(dec <=0)
      System.out.println(word.toLowerCase());
    else
      System.out.println(word.toUpperCase());
  }
}
