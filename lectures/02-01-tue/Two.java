import java.util.Scanner;
import java.util.Arrays;

public class Two {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0, count = 0;
    int[] numbers = new int[0];
    while (true) {
      System.out.println("Numbers so far: " + Arrays.toString(numbers));
      System.out.print("type> ");
      String line = in.nextLine();
      if (line.equals("bye"))
        break;
      else {
        int number = Integer.parseInt(line);
        System.out.println( "You typed: " + (number + 0));
        count += 1; 
        sum += number;
        System.out.println("Average so far is: " + ((double)sum/count)); 
        numbers = Arrays.copyOf(numbers, numbers.length + 1);
        numbers[numbers.length-1] = number; 
      }
    }
  }
}
