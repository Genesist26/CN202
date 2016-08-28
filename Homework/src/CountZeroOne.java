
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountZeroOne {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            usage();
        }

        Scanner sc = new Scanner(new FileReader(args[0]));
        PrintWriter out = new PrintWriter(new FileWriter(args[1]));

        try {
            while (sc.hasNextLine()) {
                int zero = 0;
                int one = 0;
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '0') {
                        zero++;
                    } else if (line.charAt(i) == '1') {
                        one++;
                    }
                }
                out.println(zero + " " + one);
            }
        } finally {
            sc.close();
            out.close();
        }
    }

    public static void usage() {
        System.out.println("Usage: java CountZeroOne inputTextFile OutputTextFile");
        System.exit(1);
    }
}
