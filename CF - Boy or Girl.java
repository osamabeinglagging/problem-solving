import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class BoyorGirl{
  public static void main(String[] args){
    char[] arr = new Scanner(System.in).next().toCharArray();
    int count = 1;
    Arrays.sort(arr);
    for(int i = 1; i < arr.length; i++){
      if(arr[i] != arr[i-1]) count++;
    }

    System.out.println(count % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
  }
}
