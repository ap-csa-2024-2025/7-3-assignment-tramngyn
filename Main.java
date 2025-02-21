import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<String> letters = new ArrayList<String>();
    letters.add("a");
    letters.add("b");
    letters.add("c");
    letters.add("d");
    letters.add("e");
    letters.add("f");
    shiftLeft(letters);
  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    System.out.println("ArrayList original: " + arr);
    String front = arr.remove(0);
    arr.add(front);
    System.out.println("ArrayList result: " + arr);
  }

  public static printStatistics(final ArrayList<Integer> arr)
  {
    
  }
}
