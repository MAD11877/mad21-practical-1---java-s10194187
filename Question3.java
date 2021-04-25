import java.util.Scanner;

import javax.swing.plaf.synth.SynthMenuBarUI;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    
    int num = in.nextInt();
    int times = num * num;
    System.out.print(times);
  }
}
