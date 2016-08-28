
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MergeFile {

    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            usage();
        }

        Scanner sc1 = new Scanner(new FileReader(args[0]));
        Scanner sc2 = new Scanner(new FileReader(args[1]));
        PrintWriter out = new PrintWriter(new FileWriter(args[2]));
        
        
        try {
            String allString = "";
            while(sc1.hasNextLine())
            {
                allString += sc1.nextLine();
                if(sc1.hasNextLine())
                    allString += " ";
                else
                    break;
                
            }
            allString += " ";
            while(sc2.hasNextLine())
            {
                allString += sc2.nextLine();
                if(sc2.hasNextLine())
                    allString += " ";
                else
                    break;
            }
            String[] split = allString.split(" ");
            int[] number = new int[split.length];
            
            for(int i = 0; i < split.length ; i++)
            {
                number[i] = Integer.parseInt(split[i]);
                
            }
            
            Arrays.sort(number);
            
            allString = "";
            
            for(int i = 0; i < number.length ; i++)
            {
                String x = Integer.toString(number[i]);
                allString += x;
                if(i < number.length)
                    allString += " ";
                
            }
            
            out.print(allString);
            
        } finally {
            sc1.close();
            sc2.close();
            out.close();
        }
    }

    public static void usage() {
        System.out.println("Usage:java MergeFile inputTextFile1 inputTextFile2 OutputTextFile");
        System.exit(1);
    }
}
