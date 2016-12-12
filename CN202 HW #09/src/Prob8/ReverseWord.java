package Prob8;


import java.io.*;

public class ReverseWord
{
  public static void main(String[] args)
    throws IOException
  {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader console = new BufferedReader(reader);

    while (true)
    {
      System.out.print("Enter a word [or Enter to terminate]: ");
      String input = console.readLine();
      
        
      if (input.equals(""))
        break;
      int nChars = input.length();
      Stack theStack = new Stack();
      for (int i=0; i<nChars; i++)
        theStack.push(new Character(input.charAt(i)));
      
      String output = "";
      while (!theStack.isEmpty())
      {
        char c = ((Character) theStack.pop()).charValue();
        output = output + c;
      }
      System.out.println("The reversed word: " + output);
    }
  }
}
