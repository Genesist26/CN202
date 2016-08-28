
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// FindAdditiveInverse.java
public class FindAdditiveInverse {

    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            usage();
        }

        Scanner sc = new Scanner(new FileReader(args[0]));
        PrintWriter printer = new PrintWriter(new FileWriter(args[1]));

        int x = 0;
        try {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lineScanner = new Scanner(line);
                
                while(lineScanner.hasNextInt())
                {
                    int value = lineScanner.nextInt();
                    printer.print(-value);
                    if(!lineScanner.hasNextInt())
                        break;
                    printer.print(" ");
                }

                printer.println();
            }

        } finally {
            sc.close();
            printer.close();
        }
    }

    public static void usage() {
        System.out.println("Usage:java Homework_02 InputFile OutputFile");
        System.exit(1);
    }

}
