
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
            String sorted = "";
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            while(sc1.hasNextInt()){
                int x = sc1.nextInt();
                list.add(x);
            }
            while(sc2.hasNextInt()){
                int x = sc2.nextInt();
                list.add(x);
            }
                   
            Collections.sort(list);

            for(int i = 0; i < list.size() ; i++)
            {
                String x = Integer.toString(list.get(i));
                sorted += x;
                if(i < list.size())
                    sorted += " ";
                
            }
            
            out.print(sorted);
            
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
