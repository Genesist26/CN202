
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
