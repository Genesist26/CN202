
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FindPrefixAvg {

    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            usage();
        }

        Scanner sc = new Scanner(new FileReader(args[0]));
        PrintWriter out = new PrintWriter(new FileWriter(args[1]));
        try {
            ArrayList<Double> list = new ArrayList<Double>();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNextDouble()) {
                    double x = lineScanner.nextDouble();
                    list.add(x);
                }
            }

            double sum = 0;
            int count = 1;
            double prefix = 0;

            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
                prefix = sum / count++;
                out.println(prefix);
            }
        } finally {
            sc.close();
            out.close();
        }

    }

    public static void usage() {
        System.out.println("Usage: java FindPrefixAvg inputTextFile OutputTextFile");
        System.exit(1);
    }
}
